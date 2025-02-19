package br.com.fiap.postech.products.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductApiModel
 */
@SuppressWarnings({"hiding", "static-method", "unused"})
@lombok.NoArgsConstructor
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ProductApiModel {

  private Long id;

  private String name;

  private String description;

  private BigDecimal price;

  private Integer stockQuantity;

  /**
   * Constructor with only required parameters
   */
  public ProductApiModel(String name, String description, BigDecimal price, Integer stockQuantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.stockQuantity = stockQuantity;
  }

  public ProductApiModel id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the product.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Unique identifier of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductApiModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product.
   * @return name
   */
  @NotNull @Pattern(regexp = ".+") 
  @Schema(name = "name", description = "Name of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductApiModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the product.
   * @return description
   */
  @NotNull @Pattern(regexp = ".+") 
  @Schema(name = "description", description = "Description of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductApiModel price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Price of the product.
   * minimum: 0.01
   * @return price
   */
  @NotNull @Valid @DecimalMin("0.01") 
  @Schema(name = "price", description = "Price of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ProductApiModel stockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
    return this;
  }

  /**
   * Stock quantity of the product.
   * minimum: 1
   * @return stockQuantity
   */
  @NotNull @Min(1) 
  @Schema(name = "stockQuantity", description = "Stock quantity of the product.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stockQuantity")
  public Integer getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductApiModel productApiModel = (ProductApiModel) o;
    return Objects.equals(this.id, productApiModel.id) &&
        Objects.equals(this.name, productApiModel.name) &&
        Objects.equals(this.description, productApiModel.description) &&
        Objects.equals(this.price, productApiModel.price) &&
        Objects.equals(this.stockQuantity, productApiModel.stockQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, price, stockQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductApiModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
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

    private ProductApiModel instance;

    public Builder() {
      this(new ProductApiModel());
    }

    protected Builder(ProductApiModel instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ProductApiModel value) { 
      this.instance.setId(value.id);
      this.instance.setName(value.name);
      this.instance.setDescription(value.description);
      this.instance.setPrice(value.price);
      this.instance.setStockQuantity(value.stockQuantity);
      return this;
    }

    public ProductApiModel.Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    public ProductApiModel.Builder name(String name) {
      this.instance.name(name);
      return this;
    }
    
    public ProductApiModel.Builder description(String description) {
      this.instance.description(description);
      return this;
    }
    
    public ProductApiModel.Builder price(BigDecimal price) {
      this.instance.price(price);
      return this;
    }
    
    public ProductApiModel.Builder stockQuantity(Integer stockQuantity) {
      this.instance.stockQuantity(stockQuantity);
      return this;
    }
    
    /**
    * returns a built ProductApiModel instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ProductApiModel build() {
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
  public static ProductApiModel.Builder builder() {
    return new ProductApiModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ProductApiModel.Builder toBuilder() {
    ProductApiModel.Builder builder = new ProductApiModel.Builder();
    return builder.copyOf(this);
  }

}

