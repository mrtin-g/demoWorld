package com.sda.demoworld.user;


import com.sda.demoworld.hero.Hero;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private int osmiumCurrency;
    private int heroPrice;

    private ArrayList<String>roles;

    private ArrayList<Hero>heroes;

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public ArrayList getRoles(){return roles;}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public int getOsmiumCurrency() {
        return osmiumCurrency;
    }

    public void setOsmiumCurrency(int osmium) {
        this.osmiumCurrency = osmium;
    }

    public int getHeroPrice() {
        return heroPrice;
    }

    public void setHeroPrice(int heroPrice) {
        this.heroPrice = heroPrice;
    }
}
