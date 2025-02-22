package org.example.productcatalogservice_feb2025.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {
    Long id;
    String name;
    String description;
    String imageURL;
    Double price;
    Category category;
    boolean isPrime;
}
