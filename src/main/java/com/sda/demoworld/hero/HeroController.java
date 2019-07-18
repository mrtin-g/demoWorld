package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.HeroClassTypes;
import com.sda.demoworld.user.User;
import com.sda.demoworld.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


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
            (@ModelAttribute("name") String name, @ModelAttribute("heroClass") HeroClassTypes heroClass) {

        User user =
                userService
                        .getUserRepository()
                        .findByUsername(SecurityContextHolder.getContext()
                                .getAuthentication().getName());

        if (this.creationService.canAffordHero(user)) {

            Hero hero = creationService.createHero(name, heroClass, user);

            heroService.saveHero(hero);
            heroService.setHeroOwner(hero, user);

            userService.saveUser(user);

            return "redirect:/";
        } else return "register";
    }

    @GetMapping("/createHero")
    public String createHeroView(Model model){

        model.addAttribute("user",userService
                .getUserRepository()
                .findByUsername(SecurityContextHolder
                        .getContext()
                        .getAuthentication().getName()));

        return "createHero";
    }


}
