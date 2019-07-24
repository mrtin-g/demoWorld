package com.sda.demoworld.item.builder;

import com.sda.demoworld.item.Item;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemRandomBuilderTest {

    @Test
    public void testBuildRandomItem() {

        ItemRandomBuilder randomBuilder = new ItemRandomBuilder();

        Item testItem = randomBuilder.buildRandomItem();

        assertNotNull(testItem);

        assertNotEquals("",testItem.getName());

        System.out.println(testItem.getName());
        System.out.println(testItem.getType());
        System.out.println(testItem.getValue()+" Value");
        System.out.println(testItem.getStrengthBonus()+" STR");
        System.out.println(testItem.getIntellectBonus()+" INT");
        System.out.println(testItem.getDexterityBonus()+" DEX");
        System.out.println(testItem.getHealthBonus()+" HP");
        System.out.println(testItem.getResourceBonus()+ " Res");
        System.out.println(testItem.getAttackBonus()+" Attack");
        System.out.println(testItem.getDefenseBonus()+" Defense");

    }
}