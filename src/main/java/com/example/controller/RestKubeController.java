package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestKubeController {

    @GetMapping(value = "/greeting")
    public String greeting() {
        return "Welcome to the rest application";
    }

}
