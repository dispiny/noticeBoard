package org.dispiny.noticeboard.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class signInController {
    public static void main(String[] args) {
        SpringApplication.run(mainController.class, args);
    }

    @GetMapping(value = "/api/v1/login/find", produces = "application/json")
    public ResponseEntity<String> findController(@RequestParam(name = "typeId") String typeId) {
        if ("test".equals(typeId)) {
            return ResponseEntity.ok().body("{\"status\": \"healthy\"}");
        } else {
            return ResponseEntity.ok().body("{\"status\": \"unhealthy\"}");
        }

    }
}
