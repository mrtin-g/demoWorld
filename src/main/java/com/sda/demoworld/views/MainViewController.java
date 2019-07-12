package com.sda.demoworld.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainViewController {

    @GetMapping("/main")
    public String mainView(){
        return "main";
    }


    @GetMapping("/")
    public String mainViewAll(){
        return "main";
    }
}

