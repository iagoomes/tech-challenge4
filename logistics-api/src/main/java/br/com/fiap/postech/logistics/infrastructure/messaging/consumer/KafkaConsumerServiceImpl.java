package br.com.fiap.postech.logistics.infrastructure.messaging.consumer;

import br.com.fiap.postech.logistics.domain.events.OrderCreatedEvent;
import br.com.fiap.postech.logistics.interfaces.adapters.DeliveryEventAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.function.Consumer;

@Slf4j
@Service
public class KafkaConsumerServiceImpl {

    private final DeliveryEventAdapter deliveryEventRestAdapter;

    public KafkaConsumerServiceImpl(DeliveryEventAdapter deliveryEventRestAdapter) {
        this.deliveryEventRestAdapter = deliveryEventRestAdapter;
    }

    @Bean
    public Consumer<OrderCreatedEvent> orderCreatedProcessor() {
        return event -> {
            deliveryEventRestAdapter.handleOrderCreatedEvent(event);
            log.info("Class={}, Method={}, Message received: {}", "KafkaConsumerService", "orderCreatedProcessor", event);
        };
    }
}
