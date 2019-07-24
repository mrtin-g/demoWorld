package com.sda.demoworld.stats;

public class HeroStats {

    private int strength;
    private int intellect;
    private int dexterity;

    public HeroStats (){}

    public HeroStats(int strength,int intellect,int dexterity){

        this.strength = strength;
        this.intellect = intellect;
        this.dexterity = dexterity;

    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
