package com.sda.demoworld.item;

public enum ItemTypes {

    HELMET("helmet"),ARMOR("armor"),WEAPON("weapon");

    private String itemType;

    ItemTypes(){}

    ItemTypes(String type){}

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
