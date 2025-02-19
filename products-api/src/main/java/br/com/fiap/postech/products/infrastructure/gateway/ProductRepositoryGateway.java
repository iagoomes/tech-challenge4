package br.com.fiap.postech.products.infrastructure.gateway;

import br.com.fiap.postech.products.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryGateway {
    Optional<List<Product>> saveAll(List<Product> product);
    Product save(Product product);
    Product findById(Long id);
    List<Product> findAll();
    boolean existsById(Long id);
    void deleteById(Long id);
}
