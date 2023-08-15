package com.sda.Quiz.Game.controller;


import com.sda.Quiz.Game.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthCheckDto healthCheck (){
        HealthCheckDto dto = new HealthCheckDto(true, "It is working!");
        return dto;
    }
}
