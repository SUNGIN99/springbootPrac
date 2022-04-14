package com.insungHome.springbootPrac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "mvcfirst";
    }

    @GetMapping("/viewlayout")
    public String viewlayoutPage(){
        return "viewlayout";
    }

    @GetMapping("/headerfooter")
    public String headerfooterPage(){
            return "headerfooter";
    }


}
