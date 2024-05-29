package com.capablancca.hello_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    public String hello(){
        return "Hello World!!";
    }
    @GetMapping("/jenkins")
    public String jenkinsHello(){
        return "Hello from Jenkins!!!!!";
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world from Jenkins application using GIT-101 branch-----";
    }
}
