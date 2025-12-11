package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.model.dataModel;

@Controller
public class FortuneController {

    @RequestMapping("/")
    public String start() {
        return "start.html";
    }

    @RequestMapping("/roll")
    public ModelAndView roll(@ModelAttribute dataModel data, ModelAndView mav) {
        mav.addObject("data", data);
        mav.setViewName("roll.html");
        return mav;
    }
}
