package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.HeroClassTypes;
import com.sda.demoworld.user.User;
import com.sda.demoworld.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeroController {

    @Autowired
    private HeroCreationService creationService;

    @Autowired
    private HeroService heroService;

    @Autowired
    private UserService userService;

    @PostMapping("/createHero")
    public String createHero
            (@ModelAttribute("name")String name, @ModelAttribute("heroClass")int heroClass, User user){


        if (this.creationService.canAffordHero(user)){

            Hero hero = creationService.createHero(name,heroClass,user);

            heroService.saveHero(hero);
            heroService.setHeroOwner(hero,user);

            System.out.println(hero.getOwner());
            System.out.println(user.getHeroes().get(0));

//            userService.saveUser(user);

            return "main";
        }
        else return "register";
    }





}
