package com.project.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
    @RequestMapping("/user/signup")
    private String signup() {
        return "signup_succeed";
    }
}
