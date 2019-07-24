package com.sda.demoworld.item;

public class Item {

    private String id;
    private String name;
    private ItemTypes type;
    private int value;

    private int strengthBonus;
    private int intellectBonus;
    private int dexterityBonus;

    private int attackBonus;
    private int defenseBonus;

    private int healthBonus;
    private int resourceBonus;

    public Item(){}

    public Item(
            String name,
            ItemTypes type,
            int strengthBonus,
            int intellectBonus,
            int dexterityBonus,
            int attackBonus){

        this.name = name;
        this.type = type;
        this.strengthBonus = strengthBonus;
        this.intellectBonus = intellectBonus;
        this.dexterityBonus = dexterityBonus;
        this.attackBonus = attackBonus;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemTypes getType() {
        return type;
    }

    public void setType(ItemTypes type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public int getIntellectBonus() {
        return intellectBonus;
    }

    public void setIntellectBonus(int intellectBonus) {
        this.intellectBonus = intellectBonus;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getResourceBonus() {
        return resourceBonus;
    }

    public void setResourceBonus(int resourceBonus) {
        this.resourceBonus = resourceBonus;
    }
}
