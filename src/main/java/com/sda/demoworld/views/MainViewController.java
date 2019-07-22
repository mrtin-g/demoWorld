package com.sda.demoworld.views;

import com.sda.demoworld.hero.Hero;
import com.sda.demoworld.hero.HeroService;
import com.sda.demoworld.user.User;
import com.sda.demoworld.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainViewController {

    @Autowired
    private HeroListViewController heroListViewController;

    @Autowired
    private UserService userService;

    @Autowired
    private HeroService heroService;

    @GetMapping("/main")
    public String mainView(Model model) {

        heroListViewController.heroListView(model);

        return "redirect:/";
    }


    @GetMapping("/")
    public String mainViewAll(Model model) {

        User user = userService.getUserRepository()
                .findByUsername(SecurityContextHolder.getContext()
                        .getAuthentication().getName());

        model.addAttribute("heroes", user.getHeroes());
        model.addAttribute("user", user);
        model.addAttribute("hero", new Hero());

        return "main";
    }


    @GetMapping("/heroView/{heroId}")
    public String viewHero(@PathVariable(value = "heroId") String heroId, Model model) {

        User user = userService.getUserRepository()
                .findByUsername(SecurityContextHolder.getContext()
                        .getAuthentication().getName());

        model.addAttribute("heroes", user.getHeroes());
        model.addAttribute("user", user);
        model.addAttribute("hero", heroService.findHeroById(heroId));

        return "main";
    }

    @GetMapping("/inventory/{heroId}")
    public String heroInventory(@PathVariable (value = "heroId")String heroId, Model model){

        User user = userService.getUserRepository()
                .findByUsername(SecurityContextHolder.getContext()
                        .getAuthentication().getName());

        model.addAttribute("heroes", user.getHeroes());
        model.addAttribute("user", user);
        model.addAttribute("hero", heroService.findHeroById(heroId));
        model.addAttribute("inventory",heroService.findHeroById(heroId));

        return "main";
    }
}

