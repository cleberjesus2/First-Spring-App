package com.cleber.first_spring_app.controller;

import com.cleber.first_spring_app.Service.HelloWorldService;
import com.cleber.first_spring_app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired // Injetando a dependência HelloWorldService
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Clebao");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id,@RequestBody User body){
        return "Hello World " + body.getName();
    }
}
