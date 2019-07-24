package com.sda.demoworld.item;

import com.sda.demoworld.item.builder.ItemBuilderImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {


    @Test
    public void build() {

        ItemBuilderImpl builder = new ItemBuilderImpl();
        Item item = Item.build().build();

        System.out.println(item.getName()
                +" "+item.getDexterityBonus()
                +" "+item.getIntellectBonus()
                +" "+item.getAttackBonus()
                +" "+item.getStrengthBonus());




    }

    @Test
    public void getId() {
    }

    @Test
    public void getName() {
    }
}