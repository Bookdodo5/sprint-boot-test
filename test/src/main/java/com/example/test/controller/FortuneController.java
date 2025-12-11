package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {

    @RequestMapping("Fortune")
    public String start() {
        double fn = Math.random();
        if(fn>=0.7) {
            return "Good.html";
        }
        else {
            return "Bad.html";
        }
    }
}
