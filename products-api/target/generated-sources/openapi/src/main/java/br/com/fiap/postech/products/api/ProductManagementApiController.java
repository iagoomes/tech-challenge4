package br.com.fiap.postech.products.api;

import br.com.fiap.postech.products.model.ErrorResponse;
import br.com.fiap.postech.products.model.ProductApiModel;
import br.com.fiap.postech.products.model.ProductCsvUploadResponse;
import br.com.fiap.postech.products.model.UpdateProductStockRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
@Controller
@RequestMapping("${openapi.productManagement.base-path:}")
public class ProductManagementApiController implements ProductManagementApi {

    private final ProductManagementApiDelegate delegate;

    public ProductManagementApiController(@Autowired(required = false) ProductManagementApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProductManagementApiDelegate() {});
    }

    @Override
    public ProductManagementApiDelegate getDelegate() {
        return delegate;
    }

}
