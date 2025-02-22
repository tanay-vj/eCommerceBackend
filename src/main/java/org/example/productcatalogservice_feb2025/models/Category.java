package org.example.productcatalogservice_feb2025.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category extends BaseModel {
    Long id;
    String name;
    String description;
    List<Product> products;
}
