package com.project.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {

    @RequestMapping("/")
    private String Homepage(){
        return "Hello World!";
    }


}
