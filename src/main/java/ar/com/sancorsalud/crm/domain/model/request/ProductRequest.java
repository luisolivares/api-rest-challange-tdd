package ar.com.sancorsalud.crm.domain.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("category")
    private String category;

    @JsonProperty("retail_price")
    private Double retailPrice;

    @JsonProperty("discounted_price")
    private Double discountedPrice;

    @JsonProperty("availability")
    private Boolean availability;
    
}
