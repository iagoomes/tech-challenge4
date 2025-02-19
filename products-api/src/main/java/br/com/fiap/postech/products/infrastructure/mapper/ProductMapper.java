package br.com.fiap.postech.products.infrastructure.mapper;

import br.com.fiap.postech.products.domain.entity.Product;
import br.com.fiap.postech.products.infrastructure.persistence.ProductEntity;
import br.com.fiap.postech.products.model.ProductApiModel;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductEntity toEntity(Product product){
        return new ProductEntity(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getStockQuantity());
    }
    public Product toModel(ProductEntity productEntity) {
        return new Product(productEntity.getId(), productEntity.getName(), productEntity.getDescription(), productEntity.getPrice(), productEntity.getStockQuantity());
    }

    public Product dtoToModel(ProductApiModel dto) {
        Product product = new Product();
        product.updateName(dto.getName());
        product.updateDescription(dto.getDescription());
        product.updatePrice(dto.getPrice());
        product.updateStockQuantity(dto.getStockQuantity());
        return product;
    }

    public ProductApiModel modelToDTO(Product product) {
        ProductApiModel productApiModel = new ProductApiModel();
        productApiModel.setId(product.getId());
        productApiModel.setName(product.getName());
        productApiModel.setDescription(product.getDescription());
        productApiModel.setPrice(product.getPrice());
        productApiModel.setStockQuantity(product.getStockQuantity());

        return productApiModel;
    }
}
