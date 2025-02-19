package br.com.fiap.postech.products.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductCsvUploadResponse
 */
@SuppressWarnings({"hiding", "static-method", "unused"})
@lombok.NoArgsConstructor
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ProductCsvUploadResponse {

  private String message;

  private Long createdCount;

  public ProductCsvUploadResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Success message.
   * @return message
   */
  
  @Schema(name = "message", description = "Success message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProductCsvUploadResponse createdCount(Long createdCount) {
    this.createdCount = createdCount;
    return this;
  }

  /**
   * Number of products created.
   * @return createdCount
   */
  
  @Schema(name = "createdCount", description = "Number of products created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdCount")
  public Long getCreatedCount() {
    return createdCount;
  }

  public void setCreatedCount(Long createdCount) {
    this.createdCount = createdCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCsvUploadResponse productCsvUploadResponse = (ProductCsvUploadResponse) o;
    return Objects.equals(this.message, productCsvUploadResponse.message) &&
        Objects.equals(this.createdCount, productCsvUploadResponse.createdCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, createdCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCsvUploadResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createdCount: ").append(toIndentedString(createdCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  public static class Builder {

    private ProductCsvUploadResponse instance;

    public Builder() {
      this(new ProductCsvUploadResponse());
    }

    protected Builder(ProductCsvUploadResponse instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ProductCsvUploadResponse value) { 
      this.instance.setMessage(value.message);
      this.instance.setCreatedCount(value.createdCount);
      return this;
    }

    public ProductCsvUploadResponse.Builder message(String message) {
      this.instance.message(message);
      return this;
    }
    
    public ProductCsvUploadResponse.Builder createdCount(Long createdCount) {
      this.instance.createdCount(createdCount);
      return this;
    }
    
    /**
    * returns a built ProductCsvUploadResponse instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ProductCsvUploadResponse build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static ProductCsvUploadResponse.Builder builder() {
    return new ProductCsvUploadResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ProductCsvUploadResponse.Builder toBuilder() {
    ProductCsvUploadResponse.Builder builder = new ProductCsvUploadResponse.Builder();
    return builder.copyOf(this);
  }

}

