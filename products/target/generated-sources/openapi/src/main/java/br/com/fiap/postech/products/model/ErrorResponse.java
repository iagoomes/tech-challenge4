package br.com.fiap.postech.products.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ErrorResponse
 */
@SuppressWarnings({"hiding", "static-method", "unused"})
@lombok.NoArgsConstructor
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ErrorResponse {

  private Integer status;

  private String message;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  public ErrorResponse status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code of the error.
   * @return status
   */
  
  @Schema(name = "status", description = "HTTP status code of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message describing the issue.
   * @return message
   */
  
  @Schema(name = "message", description = "Error message describing the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp when the error occurred.
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", description = "Timestamp when the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.status, errorResponse.status) &&
        Objects.equals(this.message, errorResponse.message) &&
        Objects.equals(this.timestamp, errorResponse.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

    private ErrorResponse instance;

    public Builder() {
      this(new ErrorResponse());
    }

    protected Builder(ErrorResponse instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ErrorResponse value) { 
      this.instance.setStatus(value.status);
      this.instance.setMessage(value.message);
      this.instance.setTimestamp(value.timestamp);
      return this;
    }

    public ErrorResponse.Builder status(Integer status) {
      this.instance.status(status);
      return this;
    }
    
    public ErrorResponse.Builder message(String message) {
      this.instance.message(message);
      return this;
    }
    
    public ErrorResponse.Builder timestamp(OffsetDateTime timestamp) {
      this.instance.timestamp(timestamp);
      return this;
    }
    
    /**
    * returns a built ErrorResponse instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ErrorResponse build() {
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
  public static ErrorResponse.Builder builder() {
    return new ErrorResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ErrorResponse.Builder toBuilder() {
    ErrorResponse.Builder builder = new ErrorResponse.Builder();
    return builder.copyOf(this);
  }

}

