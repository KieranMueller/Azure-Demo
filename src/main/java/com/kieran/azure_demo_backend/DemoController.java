package com.kieran.azure_demo_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello there!";
    }
}
