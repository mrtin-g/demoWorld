package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.WizardHero;
import com.sda.demoworld.stats.HeroStats;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void getStrength() {

      Hero  wiz =  new WizardHero();
      wiz.setStats(new HeroStats(99,1,5,90,60));

      assertEquals(wiz.getStrength(),99);
      System.out.println(wiz.getStrength());

        System.out.println(wiz.getCurrentHealth()+" current HP");

      wiz = new Hero();

        System.out.println("Blank str: "+wiz.getStrength());
        assertEquals(wiz.getStrength(),5);

        System.out.println(wiz.getCurrentHealth()+" current HP");


    }

    @Test
    public void getIntellect() {
    }

    @Test
    public void getDexterity() {
    }

    @Test
    public void getHelmet() {


    }

    @Test
    public void setHelmet() {
    }

    @Test
    public void getArmor() {
    }

    @Test
    public void setArmor() {
    }

    @Test
    public void getWeapon() {
    }

    @Test
    public void setWeapon() {
    }

    @Test
    public void getEquiped() {
    }

    @Test
    public void setEquiped() {
    }

    @Test
    public void isRecovering() {
    }

    @Test
    public void setRecovering() {
    }

    @Test
    public void getLocation() {
    }

    @Test
    public void setLocation() {
    }

    @Test
    public void getTraveltime() {
    }

    @Test
    public void setTraveltime() {
    }

    @Test
    public void getStats() {
    }

    @Test
    public void setStats() {
    }

    @Test
    public void getInventory() {
    }

    @Test
    public void setInventory() {
    }
}