package com.sda.demoworld.user;


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

    private ArrayList<String>roles;

    private ArrayList<String>heroes;

    public ArrayList<String> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<String> heroes) {
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
}
