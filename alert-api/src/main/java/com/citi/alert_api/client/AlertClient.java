package com.citi.alert_api.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AlertClient {

    public void fetchAlerts() {
        String url = "http://localhost:8080/api/alerts";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println("Response from API: " + response.getBody());
    }
}