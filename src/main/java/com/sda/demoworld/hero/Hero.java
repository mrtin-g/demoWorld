package com.sda.demoworld.hero;

import com.sda.demoworld.hero.classes.HeroClassTypes;
import com.sda.demoworld.item.Item;
import com.sda.demoworld.stats.HeroStats;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String id;
    private String Name;

    private String owner = "";

    private HeroClassTypes heroClass;
    private int level = 1;
    private long experience = 0;

    private HeroStats stats = new HeroStats(5,5,5,100,50);

    private Item helmet;
    private Item armor;
    private Item weapon;
    private List<Item> inventory;
    private List<Item> equiped;

    private boolean isTraveling = false;
    private boolean isRecovering = false;

    private String location;
    private LocalDateTime travelTime;

    public Hero() {
        this.inventory = new ArrayList<>();
        this.heroClass = HeroClassTypes.NOHEROSELECTED;
        this.stats = new HeroStats(0,0,0,0,0);
    }

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

        int currentStrength = stats.getStrength();

        if(armor != null)
            currentStrength += armor.getStrengthBonus();
        else if (helmet != null)
            currentStrength += helmet.getStrengthBonus();
        else if (weapon != null)
            currentStrength += weapon.getStrengthBonus();

        return currentStrength;
    }

    public int getIntellect() {

        int currentIntellect = stats.getIntellect();

        if(armor != null)
            currentIntellect += armor.getIntellectBonus();
        else if (helmet != null)
            currentIntellect += helmet.getIntellectBonus();
        else if (weapon != null)
            currentIntellect += weapon.getIntellectBonus();

        return currentIntellect;
    }

    public int getDexterity() {

       int currentDexterity = stats.getDexterity();

        if(armor != null)
            currentDexterity += armor.getDexterityBonus();
        else if (helmet != null)
            currentDexterity += helmet.getDexterityBonus();
        else if (weapon != null)
            currentDexterity += weapon.getDexterityBonus();

        return currentDexterity;
    }

    public Item getHelmet() {
        return helmet;
    }

    public void setHelmet(Item helmet) {
        this.helmet = helmet;
    }

    public Item getArmor() {
        return armor;
    }

    public void setArmor(Item armor) {
        this.armor = armor;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public List<Item> getEquiped() {
        return equiped;
    }

    public void setEquiped(List<Item> equiped) {
        this.equiped = equiped;
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

    public HeroStats getStats() {
        return stats;
    }

    public void setStats(HeroStats stats) {
        this.stats = stats;
    }

    public List<Item> getInventory() {

        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public int getMaxHealth(){

        int maxHealth = stats.getMaxHealth();

        if(armor != null)
            maxHealth += armor.getStrengthBonus();
        else if (helmet != null)
            maxHealth += helmet.getStrengthBonus();
        else if (weapon != null)
            maxHealth += weapon.getStrengthBonus();

        return maxHealth;
    }

    public int getCurrentHealth(){

        return stats.getCurrentHealth();
    }

    public int getMaxResource(){

        int maxResource = stats.getMaxResource();

        if(armor != null)
            maxResource += armor.getStrengthBonus();
        else if (helmet != null)
            maxResource += helmet.getStrengthBonus();
        else if (weapon != null)
            maxResource += weapon.getStrengthBonus();

        return maxResource;
    }

    public int getCurrentResource(){

       return stats.getCurrentResource();
    }
}
