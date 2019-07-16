package com.sda.demoworld.hero.classes;

public enum HeroClassTypes {

    WIZARD("wizard"),WARRIOR("warrior"),ROGUE("rogue"),SORCERESS("sorceress");

    private String type;

    HeroClassTypes(){}

    HeroClassTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}