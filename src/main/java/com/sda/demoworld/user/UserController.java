package com.sda.demoworld.user;

import com.sda.demoworld.hero.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //TODO create thymeleaf warning for registration failed instead of return view
    //TODO show login view with register success when register success
    //TODO move functionality to UserCreationService

    @PostMapping("/register")
    public String RegisterUser
            (@ModelAttribute("username")String username, @ModelAttribute("password")String password) {

        User user = new User(username,password);

        user.setUsername(username);
        user.setPassword(password);

        ArrayList<String> roles = new ArrayList<>();
        user.setRoles(roles);
        roles.add("ROLE_USER");
        user.setOsmiumCurrency(100);


        ArrayList<Hero> heroes = new ArrayList<>();
        user.setHeroes(heroes);

        if (!userService.userExists(user)){

            this.userService.saveUser(user);
            return "login";

        }
        else return "registerFailed";
    }

    @GetMapping("/register")
    public String registerView(Model model){
        model.addAttribute("a",null);
        return "register";
    }



}
