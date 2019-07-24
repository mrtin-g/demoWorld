package com.sda.demoworld.item.builder;

import com.sda.demoworld.item.Item;
import com.sda.demoworld.item.ItemTypes;

public class ItemBuilderImpl implements ItemBuilder {

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

    private ItemDataSelector selector = new ItemDataSelector();


    @Override
    public ItemBuilder setName(String name) {

        switch (this.type){
            case HELMET:
                this.name = selector.selectHelmetName();
            case WEAPON:
                this.name = selector.selectWeaponName();
            case ARMOR:
                this.name = selector.selectArmorName();
        }

        return this;
    }

    @Override
    public ItemBuilder setType(ItemTypes type) {
        this.type = selector.selectType();

        return this;
    }

    @Override
    public ItemBuilder setValue(int value) {
        this.value = selector.selectValueMax50();
        return this;
    }

    @Override
    public ItemBuilder setStrengthBonus(int strengthBonus) {

        if (this.name.contains("might")){

            this.strengthBonus = selector.selectStatBonusMax6();

            return this;
        }
        else this.strengthBonus = 0;
        return this;
    }

    @Override
    public ItemBuilder setIntellectBonus(int intellectBonus) {
        this.intellectBonus = intellectBonus;
        return this;
    }

    @Override
    public ItemBuilder setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
        return this;
    }

    @Override
    public ItemBuilder setAttackBonus(int attackBonus) {

        if (this.type.equals(ItemTypes.WEAPON)){

            this.attackBonus = selector.selectStatBonusMax12();
            return this;

        }else this.attackBonus = attackBonus;
        return this;
    }

    @Override
    public ItemBuilder setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
        return this;
    }

    @Override
    public ItemBuilder setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
        return this;
    }

    @Override
    public ItemBuilder setResourceBonus(int resourceBonus) {
        this.resourceBonus = resourceBonus;
        return this;
    }

    @Override
    public Item build() {

        Item item =new Item(
                type,
                name,
                strengthBonus,
                intellectBonus,
                dexterityBonus,
                attackBonus,
                defenseBonus,
                healthBonus,
                resourceBonus);

        item.setType(selector.selectType());

        return item;

    }
}
