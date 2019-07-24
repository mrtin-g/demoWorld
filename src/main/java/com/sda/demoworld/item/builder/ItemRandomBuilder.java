package com.sda.demoworld.item.builder;

import com.sda.demoworld.item.Item;
import com.sda.demoworld.item.ItemTypes;

public class ItemRandomBuilder {

    private ItemDataSelector selector = new ItemDataSelector();

    public void setType(Item item){

        item.setType(selector.selectType());

    }

    public void setName(Item item){

        switch (item.getType()){
            case HELMET:
                item.setName(selector.selectHelmetName());
                break;
            case ARMOR:
                item.setName(selector.selectArmorName());
                break;
            case WEAPON:
                item.setName(selector.selectWeaponName());
                break;

        }

    }

    private void setValue(Item item){

        if (item.getName().contains("wealth")){

            item.setValue(selector.selectValueMax100());

        }else item.setValue(selector.selectValueMax50());

    }

    public void setStrBonus(Item item){

        if (item.getName().contains("might")){

            item.setStrengthBonus(selector.selectStatBonusMax6());
        }

    }

    public void setIntBonus(Item item){

        if (item.getName().contains("mind")){

            item.setIntellectBonus(selector.selectStatBonusMax6());

        }

    }

    private void setDexBonus(Item item){

        if (item.getName().contains("speed")){

            item.setDexterityBonus(selector.selectStatBonusMax6());

        }

    }

    private void setAttackBonus(Item item){

        if (item.getType().equals(ItemTypes.WEAPON)){

            item.setAttackBonus(selector.selectStatBonusMax12());

        }

    }

    private void setDefenseBonus(Item item){

        if (item.getType().equals(ItemTypes.ARMOR)){

            item.setDefenseBonus(selector.selectStatBonusMax12());

        }

    }

    private void setHealthBonus(Item item){

        if (item.getName().contains("health")){

            item.setHealthBonus(selector.selectStatBonusMax50());

        }

    }

    private void setResourceBonus(Item item){

        if (item.getName().contains("spirit")){

            item.setResourceBonus(selector.selectStatBonusMax50());

        }

    }

    public Item buildRandomItem(){

        Item item = new Item();

        setType(item);
        setName(item);
        setValue(item);
        setStrBonus(item);
        setIntBonus(item);
        setDexBonus(item);
        setAttackBonus(item);
        setDefenseBonus(item);
        setHealthBonus(item);
        setResourceBonus(item);

        return item;
    }

}
