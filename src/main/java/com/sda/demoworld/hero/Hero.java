package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.HeroClassTypes;

import java.time.LocalDateTime;

public class Hero {

    private String id;
    private String Name;

    private String owner = "";

    private HeroClassTypes heroClass;
    private int level = 1;
    private long experience = 0;

    private int strength = 5;
    private int intellect = 5;
    private int dexterity = 5;

    private String helmet = "N/A";
    private String armor = "N/A";
    private String weapon = "N/A";

    private boolean isTraveling = false;
    private boolean isRecovering = false;

    private String location;
    private LocalDateTime travelTime;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDateTime getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(LocalDateTime travelTime) {
        this.travelTime = travelTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public HeroClassTypes getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClassTypes heroClass) {
        this.heroClass = heroClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
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

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isTraveling() {
        return isTraveling;
    }

    public void setTraveling(boolean traveling) {
        isTraveling = traveling;
    }

    public boolean isRecovering() {
        return isRecovering;
    }

    public void setRecovering(boolean recovering) {
        isRecovering = recovering;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getTraveltime() {
        return travelTime;
    }

    public void setTraveltime(LocalDateTime travelTime) {
        this.travelTime = travelTime;
    }



}
