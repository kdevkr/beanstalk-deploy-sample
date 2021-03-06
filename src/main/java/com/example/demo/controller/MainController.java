package com.example.demo.controller;

import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private final HealthEndpoint healthEndpoint;

    public MainController(HealthEndpoint healthEndpoint) {
        this.healthEndpoint = healthEndpoint;
    }

    @ResponseBody
    @GetMapping("/")
    public ResponseEntity<Status> healthStatus() {
        Status status = healthEndpoint.health().getStatus();
        HttpStatus httpStatus = Status.UP.equals(status) ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.status(httpStatus).body(status);
    }

}
