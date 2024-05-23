/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Tag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.*;

@XmlType(name = "Pet", propOrder =
    { "id", "category", "name", "photoUrls", "tags", "status" }
)


@XmlRootElement(name = "Pet")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "Pet")
@JsonPropertyOrder({
  Pet.JSON_PROPERTY_ID,
  Pet.JSON_PROPERTY_CATEGORY,
  Pet.JSON_PROPERTY_NAME,
  Pet.JSON_PROPERTY_PHOTO_URLS,
  Pet.JSON_PROPERTY_TAGS,
  Pet.JSON_PROPERTY_STATUS
})
/**
  * A pet for sale in the pet store
 **/

public class Pet  {
  
  public static final String JSON_PROPERTY_ID = "id";
  @XmlElement(name = "id")
  private Long id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  @XmlElement(name = "Category")
  private Category category;

  public static final String JSON_PROPERTY_NAME = "name";
  @XmlElement(name = "name")
  private String name;

  public static final String JSON_PROPERTY_PHOTO_URLS = "photoUrls";
  @XmlElement(name = "photoUrls")
  @XmlElementWrapper(name = "photoUrl")
  private List<String> photoUrls = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  @XmlElement(name = "Tag")
  @XmlElementWrapper(name = "tag")
  private List<Tag> tags = null;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
  public enum StatusEnum {

    @XmlEnumValue("available") AVAILABLE(String.valueOf("available")), @XmlEnumValue("pending") PENDING(String.valueOf("pending")), @XmlEnumValue("sold") SOLD(String.valueOf("sold"));


    String value;

    StatusEnum (String v) {
        value = v;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @XmlElement(name = "status")
 /**
   * pet status in the store
  **/
  private StatusEnum status;

 /**
   * Get id
   * @return id
  **/
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "id")
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "id")
  public void setId(Long id) {
    this.id = id;
  }

  public Pet id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Category")
  public Category getCategory() {
    return category;
  }

  /**
    * Set category
  **/
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "Category")
  public void setCategory(Category category) {
    this.category = category;
  }

  public Pet category(Category category) {
    this.category = category;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  @JacksonXmlProperty(localName = "name")
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  @JacksonXmlProperty(localName = "name")
  public void setName(String name) {
    this.name = name;
  }

  public Pet name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get photoUrls
   * @return photoUrls
  **/
  @JsonProperty(JSON_PROPERTY_PHOTO_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  // xmlName=photoUrl
  @JacksonXmlProperty(localName = "photoUrl")
  @JacksonXmlElementWrapper(useWrapping = true, localName = "photoUrl")
  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  /**
    * Set photoUrls
  **/
  @JsonProperty(JSON_PROPERTY_PHOTO_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  // xmlName=photoUrl
  @JacksonXmlProperty(localName = "photoUrl")
  @JacksonXmlElementWrapper(useWrapping = true, localName = "photoUrl")
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public Pet photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(String photoUrlsItem) {
    if (this.photoUrls == null) {
      this.photoUrls = new ArrayList<>();
    }
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  // xmlName=tag
  @JacksonXmlProperty(localName = "tag")
  @JacksonXmlElementWrapper(useWrapping = true, localName = "tag")
  public List<Tag> getTags() {
    return tags;
  }

  /**
    * Set tags
  **/
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  // xmlName=tag
  @JacksonXmlProperty(localName = "tag")
  @JacksonXmlElementWrapper(useWrapping = true, localName = "tag")
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Pet tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

 /**
   * pet status in the store
   * @return status
   * @deprecated
  **/
  @Deprecated
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "status")
   public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  /**
    * Set status
  **/
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "status")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Pet status(StatusEnum status) {
    this.status = status;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

