package com.practice.learnboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TopController {
    @RequestMapping("/")
    @ResponseBody
    public String top(){
        return "HelloWorld";
    }
}
