package com.sda.demoworld.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

//    @GetMapping("/login")
//    public String loginView(){
//        return "login";
//    }

    @PostMapping("/login")
    public String loginDoPost(){

        return "main";
    }

}
