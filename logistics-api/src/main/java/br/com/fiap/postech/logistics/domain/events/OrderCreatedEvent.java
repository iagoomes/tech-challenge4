package br.com.fiap.postech.logistics.domain.events;

import java.util.UUID;

public record OrderCreatedEvent(
        UUID orderId,
        Long customerId,
        AddressEvent address
) {}
