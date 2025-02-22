package br.com.fiap.postech.logistics.interfaces.gateway.impl;

import br.com.fiap.postech.logistics.domain.model.Delivery;
import br.com.fiap.postech.logistics.domain.model.DeliveryStatus;
import br.com.fiap.postech.logistics.infrastructure.persistence.entity.DeliveryEntity;
import br.com.fiap.postech.logistics.infrastructure.persistence.mapper.DeliveryEntityMapper;
import br.com.fiap.postech.logistics.infrastructure.persistence.repository.DeliveryRepository;
import br.com.fiap.postech.logistics.interfaces.gateway.database.DeliveryGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class DeliveryJpaGateway implements DeliveryGateway {
    private final DeliveryRepository repository;
    private final DeliveryEntityMapper mapper;

    public Delivery save(Delivery delivery) {

        DeliveryEntity entity = mapper.toEntity(delivery);
        DeliveryEntity savedEntity = repository.save(entity);

        logDeliverySaved(savedEntity.getId());
        return mapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Delivery> findByOrderId(UUID orderId) {
        return repository.findByOrderId(orderId).map(mapper::toDomain);
    }

    public List<Delivery> findAll() {
        return repository.findAll().stream().map(mapper::toDomain).toList();
    }

    public Optional<Delivery> findById(UUID id) {
        return repository.findById(id).map(mapper::toDomain);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    private void logDeliverySaved(UUID id) {
        log.info("Class={}, Method={}, Message={}", "DeliveryJpaGateway", "save", "Delivery saved successfully with ID: " + id);
    }

    public List<DeliveryEntity> findByAddressZipCode(String zip) {
        return repository.findByAddressZipCode(zip);
    }
}
