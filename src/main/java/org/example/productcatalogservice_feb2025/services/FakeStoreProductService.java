package org.example.productcatalogservice_feb2025.services;

import org.example.productcatalogservice_feb2025.dtos.FakeStoreProductDTO;
import org.example.productcatalogservice_feb2025.models.Category;
import org.example.productcatalogservice_feb2025.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements IProductService{

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public Product getProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDTO> fakeStoreProductDTO =
                restTemplate.getForEntity("https://fakestoreapi.com/products/{id}",
                        FakeStoreProductDTO.class, id);
        if (fakeStoreProductDTO.getBody()!=null &&
                fakeStoreProductDTO.getStatusCode().equals(HttpStatusCode.valueOf(200))) {
            return from(fakeStoreProductDTO.getBody());
        }
        return null;

    }

    private Product from(FakeStoreProductDTO fakeStoreProductDTO) {
        Product product = new Product();
        product.setId(fakeStoreProductDTO.getId());
        product.setName(fakeStoreProductDTO.getTitle());
        product.setDescription(fakeStoreProductDTO.getDescription());
        product.setPrice(fakeStoreProductDTO.getPrice());
        product.setImageURL(fakeStoreProductDTO.getImage());

        Category category = new Category();
        category.setName(fakeStoreProductDTO.getCategory());
        product.setCategory(category);
        return product;
    }
}
