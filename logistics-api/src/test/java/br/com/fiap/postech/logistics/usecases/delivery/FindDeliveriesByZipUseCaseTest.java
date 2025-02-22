package java.br.com.fiap.postech.logistics.usecases.delivery;

import br.com.fiap.postech.logistics.application.usecases.delivery.FindDeliveriesByZipUseCaseImpl;
import br.com.fiap.postech.logistics.domain.model.Delivery;
import br.com.fiap.postech.logistics.infrastructure.persistence.entity.DeliveryEntity;
import br.com.fiap.postech.logistics.infrastructure.persistence.mapper.DeliveryEntityMapper;
import br.com.fiap.postech.logistics.interfaces.gateway.database.DeliveryGateway;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FindDeliveriesByZipUseCaseTest {

    @Mock
    private DeliveryGateway deliveryGateway;

    @Mock
    private DeliveryEntityMapper mapper;

    @InjectMocks
    private FindDeliveriesByZipUseCaseImpl findDeliveriesByZipUseCase;

    private static final String TEST_ZIP_CODE = "12345-678";

    @Test
    @DisplayName("Should return a list of deliveries when there are pending deliveries for the given ZIP code")
    void shouldReturnDeliveriesListWhenPendingDeliveriesExistForZip() {
        DeliveryEntity entity = mock(DeliveryEntity.class);
        Delivery delivery = mock(Delivery.class);

        List<DeliveryEntity> entities = List.of(entity);

        when(deliveryGateway.findByAddressZipCode(TEST_ZIP_CODE))
                .thenReturn(entities);
        when(mapper.toDomain(entity)).thenReturn(delivery);

        List<Delivery> result = findDeliveriesByZipUseCase.execute(TEST_ZIP_CODE);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
        assertEquals(delivery, result.get(0));

        verify(deliveryGateway, times(1)).findByAddressZipCode(TEST_ZIP_CODE);
        verify(mapper, times(1)).toDomain(entity);
    }

    @Test
    @DisplayName("Should return an empty list when there are no pending deliveries for the given ZIP code")
    void shouldReturnEmptyListWhenNoPendingDeliveriesExistForZip() {
        when(deliveryGateway.findByAddressZipCode(TEST_ZIP_CODE))
                .thenReturn(Collections.emptyList());

        List<Delivery> result = findDeliveriesByZipUseCase.execute(TEST_ZIP_CODE);

        assertNotNull(result);
        assertTrue(result.isEmpty());

        verify(deliveryGateway, times(1)).findByAddressZipCode(TEST_ZIP_CODE);
        verifyNoInteractions(mapper);
    }
}
