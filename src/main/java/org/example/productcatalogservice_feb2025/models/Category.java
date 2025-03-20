package org.example.productcatalogservice_feb2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {
    Long id;
    String name;
    String description;
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 20)
    List<Product> products;
}
