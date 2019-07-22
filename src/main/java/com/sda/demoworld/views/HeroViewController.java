package com.sda.demoworld.views;

import com.sda.demoworld.hero.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HeroViewController {

//    @Autowired
//   private HeroService heroService;
//
//    @GetMapping("/heroView/{heroId}")
//    public String viewHero(@PathVariable(value = "heroId")String heroId, Model model){
//
//        model.addAttribute("hero",heroService.findHeroById(heroId));
//        //find hero by id
//
//
//        return "heroSingleView";
//    }

}
