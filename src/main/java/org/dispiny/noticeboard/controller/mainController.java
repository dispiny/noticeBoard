package org.dispiny.noticeboard.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class mainController {
    public static void main(String[] args) {
        SpringApplication.run(mainController.class, args);
    }

    @GetMapping(value = "/health", produces = "application/json")
    public ResponseEntity<String> healthController() {
        return ResponseEntity.ok().body("{\"status\": \"healthy\"}");
    }
}
