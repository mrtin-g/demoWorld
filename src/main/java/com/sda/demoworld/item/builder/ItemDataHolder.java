package com.sda.demoworld.item.builder;

import java.util.ArrayList;
import java.util.List;

public class ItemDataHolder {

    List<String>weaponNames = new ArrayList<>();

    List<String>helmets = new ArrayList<>();

    List<String>armorNames = new ArrayList<>();

    List<String>suffixes = new ArrayList<>();

    public ItemDataHolder(){

        weaponNames.add("Wand");
        weaponNames.add("Rod");
        weaponNames.add("Staff");

        weaponNames.add("Axe");
        weaponNames.add("Sword");
        weaponNames.add("Mace");

        weaponNames.add("Dagger");
        weaponNames.add("Katana");
        weaponNames.add("Shortsword");

        armorNames.add("Robe");
        armorNames.add("Coat");
        armorNames.add("Cloak");

        armorNames.add("Mail");
        armorNames.add("Chainmail");
        armorNames.add("Plate");

        armorNames.add("Brigandine");
        armorNames.add("Cloak");
        armorNames.add("Jerkin");

        helmets.add("Helmet");
        helmets.add("Hat");
        helmets.add("Hood");

        suffixes.add(" of mind");
        suffixes.add(" of might");
        suffixes.add(" of speed");
        suffixes.add(" of health");
        suffixes.add(" of spirit");
        suffixes.add(" of wealth");

    }

    public List<String> getWeaponNames() {
        return weaponNames;
    }

    public List<String> getHelmets() {
        return helmets;
    }

    public List<String> getArmorNames() {
        return armorNames;
    }

    public List<String> getSuffixes() {
        return suffixes;
    }

    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }
}
