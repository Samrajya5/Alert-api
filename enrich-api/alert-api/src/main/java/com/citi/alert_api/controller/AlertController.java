package com.citi.alert_api.controller;

import com.citi.alert_api.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/enrich")
public class AlertController {
    private final AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @GetMapping
    public Map<String, Object> getAllAlerts() {
        return alertService.getAllAlerts();
    }
}