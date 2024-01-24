package com.portfolio.backend.project;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/memo")
public class MemoController {
    @GetMapping("/")
    public String getMemo() {
        System.out.println("메모장 읽어오기");
        return "메모장";
    }

    @PostMapping("/")
    public void postMemo() {
        System.out.println("메모장 저장");
    }

    @DeleteMapping("/")
    public void deleteMemo() {
        System.out.println("메모장 삭제");
    }
}