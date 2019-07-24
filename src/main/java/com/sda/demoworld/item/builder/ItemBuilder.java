package com.sda.demoworld.item.builder;

import com.sda.demoworld.item.Item;
import com.sda.demoworld.item.ItemTypes;

public interface ItemBuilder {

    ItemBuilder setName (String name);
    ItemBuilder setType(ItemTypes type);
    ItemBuilder setValue(int value);

    ItemBuilder setStrengthBonus(int strengthBonus);
    ItemBuilder setIntellectBonus(int intellectBonus);
    ItemBuilder setDexterityBonus(int dexterityBonus);

    ItemBuilder setAttackBonus(int attackBonus);
    ItemBuilder setDefenseBonus(int defenseBonus);

    ItemBuilder setHealthBonus(int healthBonus);
    ItemBuilder setResourceBonus(int resourceBonus);

    Item build();

}
