package com.sda.demoworld.hero.classes;

public enum HeroClassTypes {

    WIZARD("wizard"),WARRIOR("warrior"),ROGUE("rogue"),SORCERESS("sorceress"),NOHEROSELECTED("No hero Selected");

    private String type;

    HeroClassTypes(){}

    HeroClassTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}