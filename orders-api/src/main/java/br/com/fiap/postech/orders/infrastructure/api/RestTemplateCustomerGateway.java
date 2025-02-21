package br.com.fiap.postech.orders.infrastructure.api;

import br.com.fiap.postech.orders.infrastructure.api.models.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class RestTemplateCustomerGateway implements CustomerGateway {

    private final RestTemplate restTemplate;
    @Value("${api.customers.url}")
    private String customerServiceUrl;

    public RestTemplateCustomerGateway(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Customer getCustomerById(UUID customerId) {
        String url = customerServiceUrl + "/" + customerId;
        return restTemplate.getForObject(url, Customer.class);
    }
}
