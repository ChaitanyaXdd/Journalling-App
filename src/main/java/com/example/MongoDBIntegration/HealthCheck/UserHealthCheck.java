package com.example.MongoDBIntegration.HealthCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class UserHealthCheck {
    @GetMapping
    public String healthCheck(){
        return "Ok";
    }
}
