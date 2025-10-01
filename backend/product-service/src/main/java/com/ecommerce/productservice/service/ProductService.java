package com.ecommerce.productservice.service;

import com.ecommerce.productservice.model.Product;
import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    List<Product> getProductsByCategory(String category);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}