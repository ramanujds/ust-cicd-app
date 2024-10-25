package com.ust.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {

    @GetMapping
    public String sayHello() {
        return "Hello World! Welcome to UST Global!";
    }

}
