package br.com.fiap.postech.products.api;

import br.com.fiap.postech.products.model.ErrorResponse;
import br.com.fiap.postech.products.model.ProductApiModel;
import br.com.fiap.postech.products.model.ProductCsvUploadResponse;
import br.com.fiap.postech.products.model.UpdateProductStockRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link ProductManagementApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public interface ProductManagementApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /products : Create a new product
     * Adds a new product to the system.
     *
     * @param productApiModel Product request payload. (required)
     * @return Product successfully created. (status code 201)
     *         or Invalid request payload. (status code 400)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#createProduct
     */
    default CompletableFuture<ResponseEntity<ProductApiModel>> createProduct(ProductApiModel productApiModel) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"price\" : 0.6127456183070403, \"name\" : \"name\", \"description\" : \"description\", \"stockQuantity\" : 1, \"id\" : 0 }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

    /**
     * DELETE /products/{id} : Delete a product by ID
     * Removes a product from the system.
     *
     * @param id Unique identifier of the product. (required)
     * @return Product successfully deleted. (status code 204)
     *         or Product not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#deleteProductById
     */
    default CompletableFuture<ResponseEntity<Void>> deleteProductById(Long id) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

    /**
     * GET /products : Retrieve all products
     * Fetches a list of all registered products.
     *
     * @return A list of products. (status code 200)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#getAllProducts
     */
    default CompletableFuture<ResponseEntity<List<ProductApiModel>>> getAllProducts() {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "[ { \"price\" : 0.6127456183070403, \"name\" : \"name\", \"description\" : \"description\", \"stockQuantity\" : 1, \"id\" : 0 }, { \"price\" : 0.6127456183070403, \"name\" : \"name\", \"description\" : \"description\", \"stockQuantity\" : 1, \"id\" : 0 } ]";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

    /**
     * GET /products/{id} : Retrieve a product by ID
     * Fetches product details by its unique identifier.
     *
     * @param id Unique identifier of the product. (required)
     * @return Product details. (status code 200)
     *         or Product not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#getProductById
     */
    default CompletableFuture<ResponseEntity<ProductApiModel>> getProductById(Long id) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"price\" : 0.6127456183070403, \"name\" : \"name\", \"description\" : \"description\", \"stockQuantity\" : 1, \"id\" : 0 }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

    /**
     * PUT /products/{id} : Update a product by ID
     * Updates an existing product with new details.
     *
     * @param id Unique identifier of the product. (required)
     * @param productApiModel Product request payload. (required)
     * @return Product successfully updated. (status code 200)
     *         or Invalid request payload. (status code 400)
     *         or Product not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#updateProductById
     */
    default CompletableFuture<ResponseEntity<ProductApiModel>> updateProductById(Long id,
        ProductApiModel productApiModel) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"price\" : 0.6127456183070403, \"name\" : \"name\", \"description\" : \"description\", \"stockQuantity\" : 1, \"id\" : 0 }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

    /**
     * PATCH /products/update-stock : Update stock quantities for multiple products
     * Updates the stock quantities for a list of products.
     *
     * @param updateProductStockRequest  (required)
     * @return Stock quantities successfully updated. (status code 200)
     *         or Invalid request payload. (status code 400)
     *         or Product not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#updateProductStock
     */
    default CompletableFuture<ResponseEntity<Void>> updateProductStock(List<@Valid UpdateProductStockRequest> updateProductStockRequest) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

    /**
     * POST /product-uploads : Upload a CSV file to create products
     * Adds new products to the system from a CSV file.
     *
     * @param file The CSV file containing product data. (optional)
     * @return Products successfully created. (status code 201)
     *         or Invalid request payload. (status code 400)
     *         or Internal server error. (status code 500)
     * @see ProductManagementApi#uploadProductCsv
     */
    default CompletableFuture<ResponseEntity<ProductCsvUploadResponse>> uploadProductCsv(MultipartFile file) {
        return CompletableFuture.supplyAsync(()-> {
            getRequest().ifPresent(request -> {
                for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"createdCount\" : 0 }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                    if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                        String exampleString = "{ \"message\" : \"message\", \"status\" : 5, \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                        ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                    }
                }
            });
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }, Runnable::run);

    }

}
