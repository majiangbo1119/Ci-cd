package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message_output {

    @GetMapping("/message")
    public String message() {
        return "Hello, this is a message from the CI/CD application!";
    }

}
