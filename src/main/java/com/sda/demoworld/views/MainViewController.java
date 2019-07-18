package com.sda.demoworld.views;

import com.sda.demoworld.user.User;
import com.sda.demoworld.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainViewController {

    @Autowired
    private HeroListViewController heroListViewController;

    @Autowired
    private UserService userService;

    @GetMapping("/main")
    public String mainView(Model model){

        heroListViewController.heroListView(model);


        return "redirect:/";
    }


    @GetMapping("/")
    public String mainViewAll(Model model){

        User user = userService.getUserRepository()
                .findByUsername(SecurityContextHolder.getContext()
                        .getAuthentication().getName());

        model.addAttribute("heroes",user.getHeroes());
        model.addAttribute("user",user);

        return "main";
    }
}

