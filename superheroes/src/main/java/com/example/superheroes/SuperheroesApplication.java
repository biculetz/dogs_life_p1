package com.example.superheroes;

import com.example.superheroes.model.Hero;
import com.example.superheroes.repository.HeroRepository;
import com.example.superheroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SuperheroesApplication implements CommandLineRunner {

	@Autowired
	HeroService hs;

	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Hero> heroes = hs.getAllHeroes();
		System.out.println("Query for all Heroes");
		for(Hero hero : heroes) {
			System.out.println(hero);
		}

		heroes = hs.getHeroesStartingWithLetter("D");
		System.out.println("Query for Heroes with Starting Letter D");
		for(Hero hero : heroes) {
			System.out.println(hero);
		}

		heroes = hs.getLastThreeHeroesByName();
		System.out.println("Query for last three Heroes by Name");
		for(Hero hero : heroes) {
			System.out.println(hero);
		}
	}
}
