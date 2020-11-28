package com.somita.microservice.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations(){

        return new LimitConfiguration(100, 1);
    }
}
