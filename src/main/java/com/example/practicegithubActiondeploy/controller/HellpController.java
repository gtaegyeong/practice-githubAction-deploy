package com.example.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellpController {

    @GetMapping("/")
    public String hello(){
        return "헬로월드! 헬로 비 붓캠!";
    }
}
