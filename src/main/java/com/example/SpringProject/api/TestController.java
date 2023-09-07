package com.example.SpringProject.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {


    @Value("${server.port}")
    int portNumber;
    @Value("${spring.application.name}")
    String applicatonName;


    @GetMapping("/process")
    public String test (){
        return applicatonName+"started "+portNumber;
    }

}
