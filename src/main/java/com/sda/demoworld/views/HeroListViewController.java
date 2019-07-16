package com.sda.demoworld.views;


import com.sda.demoworld.hero.Hero;
import com.sda.demoworld.user.User;
import com.sda.demoworld.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroListViewController {

    @Autowired
    private UserService userService;

    @GetMapping("/herolist")
    public String heroListView(Model model){

        User user = userService.getUserRepository()
                .findByUsername(SecurityContextHolder.getContext()
                        .getAuthentication().getName());

        model.addAttribute("heroes",user.getHeroes());

        return "heroesList";
    }

}
