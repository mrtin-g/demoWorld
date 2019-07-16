package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.*;
import com.sda.demoworld.user.User;
import org.springframework.stereotype.Service;

@Service
public class HeroCreationService {

    Hero hero;

    public boolean canAffordHero(User user) {
        return user.getOsmiumCurrency() - user.getHeroPrice() >= 0;
    }

    public Hero createHero
            (String name, HeroClassTypes heroClass, User user) {

        switch (heroClass) {
            case WIZARD:
                this.hero = new WizardHero();
                this.hero.setName(name);
                this.hero.setOwner(user.getUsername());
                return this.hero;

            case ROGUE:
                this.hero = new RogueHero();
                hero.setName(name);
                hero.setOwner(user.getUsername());
                return hero;

            case WARRIOR:
                this.hero = new WarriorHero();
                hero.setName(name);
                hero.setOwner(user.getUsername());
                return hero;

            case SORCERESS:
                this.hero = new SorceressHero();
                hero.setName(name);
                hero.setOwner(user.getUsername());
                return hero;
        }
        return hero;
    }

    public void saveHero(){

    }

}
