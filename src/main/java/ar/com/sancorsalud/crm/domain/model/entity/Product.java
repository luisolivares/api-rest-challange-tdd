package ar.com.sancorsalud.crm.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Product")
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "retail_price")
    @JsonProperty("retail_price")
    private Double retailPrice;

    @Column(name = "discounted_price")
    @JsonProperty("discounted_price")
    private Double discountedPrice;

    @Column(name = "availability")
    private Boolean availability;
}
