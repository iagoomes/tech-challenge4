package br.com.fiap.postech.products.application.gateway.impl;

import br.com.fiap.postech.products.domain.entity.Product;
import br.com.fiap.postech.products.infrastructure.gateway.ProductRepositoryGateway;
import br.com.fiap.postech.products.infrastructure.mapper.ProductMapper;
import br.com.fiap.postech.products.model.ProductApiModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CreateProductGatewayImplTest {

    @Mock
    private ProductRepositoryGateway productRepositoryGateway;

    @Mock
    private ProductMapper productMapper;

    @InjectMocks
    private CreateProductGatewayImpl createProductGateway;

    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void createProduct_ValidProduct_ReturnsCreatedProduct() {
        ProductApiModel dto = new ProductApiModel();
        ProductApiModel savedDto = new ProductApiModel();
        when(productMapper.dtoToModel(dto)).thenReturn(new Product());
        when(productRepositoryGateway.save(any(Product.class))).thenReturn(new Product());
        when(productMapper.modelToDTO(any(Product.class))).thenReturn(savedDto);

        ProductApiModel result = createProductGateway.createProduct(dto);

        assertNotNull(result);
        assertEquals(savedDto, result);
    }

}