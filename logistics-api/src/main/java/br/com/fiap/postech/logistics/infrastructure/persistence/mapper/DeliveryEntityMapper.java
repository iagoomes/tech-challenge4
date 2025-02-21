package br.com.fiap.postech.logistics.infrastructure.persistence.mapper;

import br.com.fiap.postech.logistics.domain.factory.DeliveryFactory;
import br.com.fiap.postech.logistics.domain.model.Delivery;
import br.com.fiap.postech.logistics.infrastructure.persistence.entity.DeliveryEntity;
import org.springframework.stereotype.Component;

@Component
public class DeliveryEntityMapper {

    private final DeliveryFactory deliveryFactory;
    private final DeliveryAddressMapper addressMapper;
    private final CourierMapper courierMapper;

    public DeliveryEntityMapper(DeliveryFactory deliveryFactory, DeliveryAddressMapper addressMapper, CourierMapper courierMapper) {
        this.deliveryFactory = deliveryFactory;
        this.addressMapper = addressMapper;
        this.courierMapper = courierMapper;
    }

    public Delivery toDomain(DeliveryEntity entity) {
        if (entity == null) return null;
        return deliveryFactory.create(
                entity.getId(),
                entity.getOrderId(),
                entity.getCustomerId(),
                courierMapper.toDomain(entity.getCourier()),
                entity.getStatus(),
                addressMapper.toDomain(entity.getAddress()),
                entity.getCreatedAt(),
                entity.getDeliveredAt()
        );
    }

    public DeliveryEntity toEntity(Delivery delivery) {
        if (delivery == null) return null;
        return DeliveryEntity.create(
                delivery.getId(),
                delivery.getOrderId(),
                delivery.getCustomerId(),
                courierMapper.toEntity(delivery.getCourier()),
                delivery.getStatus(),
                addressMapper.toEntity(delivery.getAddress()),
                delivery.getLatitude(),
                delivery.getLongitude(),
                delivery.getCreatedAt(),
                delivery.getDeliveredAt()
        );
    }

    public void updateEntityFromDomain(DeliveryEntity entity, Delivery delivery) {
        if (entity == null || delivery == null) return;

        entity.assignCourier(courierMapper.toEntity(delivery.getCourier()));
        entity.updateStatus(delivery.getStatus());
        entity.markAsDelivered(delivery.getDeliveredAt());

        if (entity.getAddress() != null) {
            entity.updateAddress(addressMapper.toEntity(delivery.getAddress()));
        }
    }
}
