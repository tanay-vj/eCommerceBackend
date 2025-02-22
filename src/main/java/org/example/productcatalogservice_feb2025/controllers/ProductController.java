package org.example.productcatalogservice_feb2025.controllers;

import org.example.productcatalogservice_feb2025.dtos.CategoryDTO;
import org.example.productcatalogservice_feb2025.dtos.ProductDTO;
import org.example.productcatalogservice_feb2025.models.Category;
import org.example.productcatalogservice_feb2025.models.Product;
import org.example.productcatalogservice_feb2025.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;


    @GetMapping("/products/")
    public List<ProductDTO> getAllProducts() {

        return null;
    }

    @GetMapping("/products/{id}")
    public ProductDTO getProductDetails(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return null;
        }
        return from(product);

    }

    @PatchMapping("/products/{id}")
    public ProductDTO updateProductDetails(@PathVariable Long id,
                                     @RequestBody ProductDTO productDTO) {
        return null;


    }

    @PutMapping("/products/{id}")
    public ProductDTO replaceProductDetails(@PathVariable Long id,
                                           @RequestBody ProductDTO productDTO) {
        return null;

    }

    @PostMapping("/products")
    public ProductDTO createProductDetails( @RequestBody ProductDTO productDTO) {
        return null;

    }

    @DeleteMapping("/product/{id}")
    public boolean deleteProductDetails(@PathVariable Long id) {
        return false;
    }


    private ProductDTO from(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setImageURL(product.getImageURL());
        if(product.getCategory()!=null) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(product.getCategory().getId());
            categoryDTO.setName(product.getCategory().getName());
            categoryDTO.setDescription(product.getCategory().getDescription());
            productDTO.setCategory(categoryDTO);
        }
        return productDTO;
    }

    private Product to(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        return product;
    }


}
