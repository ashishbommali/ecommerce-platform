package com.ecommerce.orderservice.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public boolean isUserExists(Long userId) {
        try {
            String url = "http://localhost:8081/users/" + userId; // adjust port
            restTemplate.getForObject(url, Object.class);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}