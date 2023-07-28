package com.example.superheroes.controller;

import com.example.superheroes.model.Hero;
import com.example.superheroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroService hs;

    @GetMapping("/heroes")
    public List<Hero> getAllHeroes(){
        return hs.getAllHeroes();
    }

    @GetMapping("/heroes/{letter}")
    public List<Hero> getHeroesStartingWithLetter(@PathVariable String letter){
        return hs.getHeroesStartingWithLetter(letter);
    }

}
