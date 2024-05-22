/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * FakeBigDecimalMap200Response
 */
@JsonPropertyOrder({
  FakeBigDecimalMap200Response.JSON_PROPERTY_SOME_ID,
  FakeBigDecimalMap200Response.JSON_PROPERTY_SOME_MAP
})
@JsonTypeName("fakeBigDecimalMap_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
@XmlRootElement(name = "FakeBigDecimalMap200Response")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "FakeBigDecimalMap200Response")
public class FakeBigDecimalMap200Response {
  public static final String JSON_PROPERTY_SOME_ID = "someId";
  @XmlElement(name = "someId")
  private BigDecimal someId;

  public static final String JSON_PROPERTY_SOME_MAP = "someMap";
  // Is a container wrapped=false
  @XmlElement(name = "someMap")
  private Map<String, BigDecimal> someMap = new HashMap<>();

  public FakeBigDecimalMap200Response() {
  }

  public FakeBigDecimalMap200Response someId(BigDecimal someId) {
    
    this.someId = someId;
    return this;
  }

   /**
   * Get someId
   * @return someId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "someId")

  public BigDecimal getSomeId() {
    return someId;
  }


  @JsonProperty(JSON_PROPERTY_SOME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "someId")
  public void setSomeId(BigDecimal someId) {
    this.someId = someId;
  }

  public FakeBigDecimalMap200Response someMap(Map<String, BigDecimal> someMap) {
    
    this.someMap = someMap;
    return this;
  }

  public FakeBigDecimalMap200Response putSomeMapItem(String key, BigDecimal someMapItem) {
    if (this.someMap == null) {
      this.someMap = new HashMap<>();
    }
    this.someMap.put(key, someMapItem);
    return this;
  }

   /**
   * Get someMap
   * @return someMap
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOME_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "someMap")
  @JacksonXmlElementWrapper(useWrapping = false)

  public Map<String, BigDecimal> getSomeMap() {
    return someMap;
  }


  @JsonProperty(JSON_PROPERTY_SOME_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "someMap")
  @JacksonXmlElementWrapper(useWrapping = false)
  public void setSomeMap(Map<String, BigDecimal> someMap) {
    this.someMap = someMap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FakeBigDecimalMap200Response fakeBigDecimalMap200Response = (FakeBigDecimalMap200Response) o;
    return Objects.equals(this.someId, fakeBigDecimalMap200Response.someId) &&
        Objects.equals(this.someMap, fakeBigDecimalMap200Response.someMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(someId, someMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FakeBigDecimalMap200Response {\n");
    sb.append("    someId: ").append(toIndentedString(someId)).append("\n");
    sb.append("    someMap: ").append(toIndentedString(someMap)).append("\n");
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

}

