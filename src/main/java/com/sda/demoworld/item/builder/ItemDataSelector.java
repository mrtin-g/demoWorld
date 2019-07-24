package com.sda.demoworld.item.builder;

import com.sda.demoworld.item.Item;
import com.sda.demoworld.item.ItemTypes;

import java.util.Random;

public class ItemDataSelector {

    private ItemDataHolder dataHolder = new ItemDataHolder();

    private Random random = new Random();

    public ItemTypes selectType(){

       int a =  random.nextInt(3);
       ItemTypes type = null;

       switch (a){
           case 1:
               type = ItemTypes.WEAPON;
               break;
           case 2:
               type = ItemTypes.ARMOR;
               break;
           case 3:
               type = ItemTypes.HELMET;
               break;
       }

       return type;

    }

    public String selectArmorName(){

        int sizeOfNameList = dataHolder.getArmorNames().size()-1;
        String name = "";

        name += dataHolder.getArmorNames().get(random.nextInt(sizeOfNameList));

        sizeOfNameList = dataHolder.getSuffixes().size()-1;

        name += dataHolder.getSuffixes().get(random.nextInt(sizeOfNameList));

        return name;
    }

    public String selectWeaponName(){

        int sizeOfNameList = dataHolder.getWeaponNames().size()-1;
        String name = "";

        name += dataHolder.getWeaponNames().get(random.nextInt(sizeOfNameList));

        sizeOfNameList = dataHolder.getSuffixes().size()-1;

        name += dataHolder.getSuffixes().get(random.nextInt(sizeOfNameList));

        return name;
    }

    public String selectHelmetName(){

        int sizeOfNameList = dataHolder.getHelmets().size()-1;
        String name = "";

        name += dataHolder.getHelmets().get(random.nextInt(sizeOfNameList));

        sizeOfNameList = dataHolder.getSuffixes().size()-1;

        name += dataHolder.getSuffixes().get(random.nextInt(sizeOfNameList));

        return name;
    }

    public int selectValueMax50(){

       return random.nextInt(40)+10;
    }

    public int selectValueMax100(){

        return random.nextInt(50)+50;
    }

    protected int selectStatBonusMax6(){

        return random.nextInt(5)+1;

    }

    protected int selectStatBonusMax12(){

        return random.nextInt(11)+1;
    }

    protected int selectStatBonusMax50(){

        return random.nextInt(40)+10;

    }









}
