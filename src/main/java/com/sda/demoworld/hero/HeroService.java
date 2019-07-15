package com.sda.demoworld.hero;

import com.sda.demoworld.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public boolean heroExists(Hero hero){

        hero = this.heroRepository.findByid(hero.getId());



        return !hero.getId().equals("");
    }

    public void saveHero(Hero hero){


            this.heroRepository.save(hero);



    }

    public void setHeroOwner(Hero hero,User user){

        hero.setOwner(user.getUsername());

        if (user.getHeroes() == null){

            user.setHeroes(new ArrayList<>());

        }

        user.getHeroes().add(hero.getId());
    }

    public void deleteHero(Hero hero){

        if (heroExists(hero)){

            this.heroRepository.delete(hero);

        }

    }







}
