package com.portfolio.backend.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class projectController {

    @PostMapping("/templete")
    public String physicalGuide() {
        System.out.println("뭐 할거 있나 이거");
        return "여기에 html 파일명?";
    }
}
