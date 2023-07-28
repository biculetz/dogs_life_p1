package com.example.superheroes;

import com.example.superheroes.model.Hero;
import com.example.superheroes.practice.Calculator;
import com.example.superheroes.repository.HeroRepository;
import com.example.superheroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class SuperheroesApplication implements CommandLineRunner {

	@Autowired
	Calculator calc;

	@Autowired
	HeroRepository heroRepository;

	//inject service
	@Autowired
	HeroService heroService;

	public static void main(String[] args) {

		SpringApplication.run(SuperheroesApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception{
//		System.out.println("Hello World!");
//		int result = calc.addition(3,4);
//		System.out.println(result);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Hero> heroes = heroRepository.findTop3ByOrderByNameDesc();
//		for (Hero hero: heroes){
//			System.out.println(hero);
//		}
//	}

//	public void run(String... args) throws Exception {
//		List<Hero> heroes = heroRepository.findHeroesNameStartingWithLetter("C%");
//		for (Hero hero : heroes){
//			System.out.println(hero);
//		}
//	}

	//Using service
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test 1: print hero starting with C");
		List<Hero> heroes = heroService.getHeroesStartingWithLetter("C");
		for (Hero hero:heroes){
			System.out.println(hero);
		}

		System.out.println("Test 2: print all heroes");
		List<Hero> heroes2 = heroService.getAllHeroes();
		for (Hero hero:heroes2){
			System.out.println(hero);
		}

		System.out.println("Test 3: print the last 3 heroes");
		List<Hero> heroes3 = heroService.getLastThreeHeroesByName();
		for (Hero hero:heroes3){
			System.out.println(hero);
		}
	}

}
