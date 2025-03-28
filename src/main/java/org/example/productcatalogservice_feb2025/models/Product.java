package org.example.productcatalogservice_feb2025.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product extends BaseModel {
    Long id;
    String name;
    String description;
    String imageURL;
    Double price;
    @ManyToOne(cascade = CascadeType.ALL)
    Category category;
    boolean isPrime;

    public Product() {
        this.setCreatedAt(new Date());
        this.setLastUpdatedAt(new Date());
        this.setState(State.ACTIVE);
    }
}
