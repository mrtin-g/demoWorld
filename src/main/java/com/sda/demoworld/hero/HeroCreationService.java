package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.*;
import com.sda.demoworld.item.Item;
import com.sda.demoworld.item.ItemTypes;
import com.sda.demoworld.stats.HeroStats;
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
                hero.setStats(new HeroStats(3,8,4,90,60));
                hero.getInventory().add(new Item( ItemTypes.WEAPON,"Stick",0,0,0,1,0,0,0));
                hero.setOwner(user.getUsername());
                return hero;

            case ROGUE:
                hero = new RogueHero();
                hero.setName(name);
                hero.setHeroClass(HeroClassTypes.ROGUE);
                hero.setStats(new HeroStats(4,4,7,95,55));
                hero.getInventory().add(new Item( ItemTypes.WEAPON,"Stick",0,0,0,1,0,0,0));
                hero.setOwner(user.getUsername());
                return hero;

            case WARRIOR:
                hero = new WarriorHero();
                hero.setName(name);
                hero.setHeroClass(HeroClassTypes.WARRIOR);
                hero.setStats(new HeroStats(7,2,6,100,50));
                hero.getInventory().add(new Item( ItemTypes.WEAPON,"Stick",0,0,0,1,0,0,0));
                hero.setOwner(user.getUsername());
                return hero;

            case SORCERESS:
                hero = new SorceressHero();
                hero.setName(name);
                hero.setHeroClass(HeroClassTypes.SORCERESS);
                hero.setStats(new HeroStats(3,7,5,90,60));
                hero.getInventory().add(new Item( ItemTypes.WEAPON,"Stick",0,0,0,1,0,0,0));
                hero.setOwner(user.getUsername());
                return hero;
        }
        return hero;
    }

    public void saveHero(){

    }

}
