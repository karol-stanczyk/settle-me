package com.print.it.settleme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }
}
