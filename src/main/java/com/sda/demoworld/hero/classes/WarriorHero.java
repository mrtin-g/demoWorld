package com.sda.demoworld.hero.classes;

import com.sda.demoworld.hero.Hero;
import com.sda.demoworld.hero.HeroMight;

public class WarriorHero extends Hero implements HeroMight {

    private int maxHealth = 100;
    private int currentHealth = 100;
    private int maxResource = 50;
    private int currentResource = 50;

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
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

    @Override
    public void mightAttack() {

    }
}
