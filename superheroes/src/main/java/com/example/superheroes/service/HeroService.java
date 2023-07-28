package com.example.superheroes.service;

import com.example.superheroes.model.Hero;
import com.example.superheroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    @Autowired
    HeroRepository hr;

    public List<Hero> getHeroesStartingWithLetter(String letter){
        return hr.findHeroesNameStartingWithLetter(letter + "%");
    }

    public List<Hero> getAllHeroes() {
        return hr.findAll();
    }

    public List<Hero> getLastThreeHeroesByName() {
        return hr.findTop3ByOrderByNameDesc();
    }

}
