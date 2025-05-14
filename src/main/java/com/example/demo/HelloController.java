package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @Value("${app.welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome-msg")
    public ResponseEntity<String> getWelcomeMessage(){
        return ResponseEntity.ok(welcomeMsg);
    }
}
