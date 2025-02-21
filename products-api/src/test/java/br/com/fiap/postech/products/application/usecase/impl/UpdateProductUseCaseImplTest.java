package br.com.fiap.postech.products.application.usecase.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import br.com.fiap.postech.products.application.gateway.UpdateProductGateway;
import br.com.fiap.postech.products.exception.InvalidProductException;
import br.com.fiap.postech.products.model.ProductApiModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UpdateProductUseCaseImplTest {

    private UpdateProductUseCaseImpl updateProductUseCase;
    private UpdateProductGateway updateProductGateway;

    @BeforeEach
    void setUp() {
        updateProductGateway = mock(UpdateProductGateway.class);
        updateProductUseCase = new UpdateProductUseCaseImpl(updateProductGateway);
    }

    @Test
    void executeValidIdAndProductReturnsUpdatedProduct() {
        Long productId = 1L;
        ProductApiModel productApiModel = new ProductApiModel();
        when(updateProductGateway.updateProduct(productId, productApiModel)).thenReturn(productApiModel);

        ProductApiModel result = updateProductUseCase.execute(productId, productApiModel);

        assertEquals(productApiModel, result);
    }

    @Test
    void executeNullIdThrowsInvalidProductException() {
        ProductApiModel productApiModel = new ProductApiModel();
        assertThrows(InvalidProductException.class, () -> updateProductUseCase.execute(null, productApiModel));
    }

    @Test
    void executeNullProductThrowsInvalidProductException() {
        Long productId = 1L;
        assertThrows(InvalidProductException.class, () -> updateProductUseCase.execute(productId, null));
    }

    @Test
    void executeGatewayThrowsExceptionThrowsException() {
        Long productId = 1L;
        ProductApiModel productApiModel = new ProductApiModel();
        when(updateProductGateway.updateProduct(productId, productApiModel)).thenThrow(new RuntimeException("Database error"));

        assertThrows(RuntimeException.class, () -> updateProductUseCase.execute(productId, productApiModel));
    }
}