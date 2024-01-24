package com.portfolio.backend.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class projectController {

    @PostMapping("/templete")
    public String physicalGuide() {
        System.out.println("뭐 할거 있나 이거");
        return "여기에 html 파일명?";
    }

    @PostMapping("/mojoai")
    public String mojoAi() {
        System.out.println("mojo");
        return "mojo";
    }

    @PostMapping("/midas")
    public String midasHackathon() {
        System.out.println("마이다스 해커톤");
        return "midas";
    }

    @PostMapping("/numberclock")
    public String numberClock() {
        System.out.println("숫자로 이루어진 시계");
        return "numberclock";
    }

    @PostMapping("/somein")
    public String somein() {
        System.out.println("소마인 커뮤니티");
        return "somein";
    }

    @PostMapping("/stepassister")
    public String stepAssister() {
        System.out.println("Step Assister");
        return "Step Assister";
    }

    @PostMapping("/petpong")
    public String Petpong() {
        System.out.println("펫퐁 커뮤니티");
        return "petpong";
    }
}
