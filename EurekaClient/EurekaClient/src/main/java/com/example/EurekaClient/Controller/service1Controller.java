package com.example.EurekaClient.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class service1Controller {

    @GetMapping("/service1")
    public String service1() {
        return "Hello from Service 1!";
    }

}

