package com.citi.alert_api;

import org.springframework.boot.SpringApplication;
import com.citi.alert_api.client.AlertClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlertApiApplication {
	private final AlertClient alertClient;

	public AlertApiApplication(AlertClient alertClient) {
		this.alertClient = alertClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(AlertApiApplication.class, args);
	}

	public void run(String... args) {
		alertClient.fetchAlerts();
	}
}
