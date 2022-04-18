package com.insungHome.springbootPrac.controller;

import com.insungHome.springbootPrac.dto.Articleform;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newDtoForm(){
        return "articles/new";
    }

    @GetMapping("/articles/create")
    public String createArticle(Articleform form){
        System.out.println(form.toString());

        return "";
    }

}
