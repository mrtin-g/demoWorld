package com.sda.demoworld.stats;

public class HeroStats {

    private int strength;
    private int intellect;
    private int dexterity;

    private int currentHealth = 0;
    private int maxHealth = 0;

    private int maxResource;
    private int currentResource;

    public HeroStats (){}

    public HeroStats(int strength,int intellect,int dexterity,int maxHealth, int maxResource){

        this.strength = strength;
        this.intellect = intellect;
        this.dexterity = dexterity;

        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;

        this.maxResource = maxHealth;
        this.currentResource = maxHealth;

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

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxResource() {
        return maxResource;
    }

    public void setMaxResource(int maxResource) {
        this.maxResource = maxResource;
    }

    public int getCurrentResource() {
        return currentResource;
    }

    public void setCurrentResource(int currentResource) {
        this.currentResource = currentResource;
    }
}
