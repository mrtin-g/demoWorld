package com.sda.demoworld.item.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemDataSelectorTest {

    @Test
    public void testSelectType() {

        ItemDataSelector selector = new ItemDataSelector();



        System.out.println(selector.selectType());

        assertFalse(selector.selectType()==null);

    }

    @Test
    public void testSelectArmorName() {

        ItemDataSelector selector = new ItemDataSelector();

        System.out.println(selector.selectArmorName());
        System.out.println(selector.selectArmorName());
        System.out.println(selector.selectArmorName());

        assertNotEquals("Armor name should not be empty",
                selector.selectArmorName().equals(""),
                selector.selectArmorName());

    }
}