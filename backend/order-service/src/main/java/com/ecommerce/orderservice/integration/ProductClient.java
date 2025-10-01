package com.ecommerce.orderservice.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public boolean isProductAvailable(String productName) {
        try {
            String url = "http://localhost:8082/api/products"; // adjust port
            Object[] products = restTemplate.getForObject(url, Object[].class);
            if (products != null) {
                for (Object p : products) {
                    if (p.toString().contains(productName)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}