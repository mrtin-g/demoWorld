package com.sda.demoworld.item;


import com.sda.demoworld.hero.Hero;
import com.sda.demoworld.hero.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private HeroService heroService;

    public boolean itemExists(Item item){

       item = this.itemRepository.findByid(item.getId());

        return !item.getId().equals("");

    }


    public void saveItem(Item item){

        this.itemRepository.save(item);

    }

    public void setItemOwner(Hero hero,Item item){

    }

    public void deleteItem(Item item){

        if (itemExists(item)){

            itemRepository.delete(item);

        }

    }





}
