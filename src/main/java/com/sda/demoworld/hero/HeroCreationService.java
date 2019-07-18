package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.*;
import com.sda.demoworld.user.User;
import org.springframework.stereotype.Service;

@Service
public class HeroCreationService {



    public boolean canAffordHero(User user) {
        return user.getOsmiumCurrency() - user.getHeroPrice() >= 0;
    }

    public Hero createHero
            (String name, HeroClassTypes heroClass, User user) {

        if(name == null || heroClass == null || user == null){
            return null;
        }

        Hero hero = null;
        switch (heroClass) {
            case WIZARD:
                hero = new WizardHero();
                hero.setName(name);
                hero.setHeroClass(heroClass);
                hero.setOwner(user.getUsername());
                return hero;

            case ROGUE:
                hero = new RogueHero();
                hero.setName(name);
                hero.setHeroClass(HeroClassTypes.ROGUE);
                hero.setOwner(user.getUsername());
                return hero;

            case WARRIOR:
                hero = new WarriorHero();
                hero.setName(name);
                hero.setHeroClass(HeroClassTypes.WARRIOR);
                hero.setOwner(user.getUsername());
                return hero;

            case SORCERESS:
                hero = new SorceressHero();
                hero.setName(name);
                hero.setHeroClass(HeroClassTypes.SORCERESS);
                hero.setOwner(user.getUsername());
                return hero;
        }
        return hero;
    }

    public void saveHero(){

    }

}
