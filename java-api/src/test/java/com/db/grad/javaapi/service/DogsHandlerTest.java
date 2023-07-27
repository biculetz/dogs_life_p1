package com.db.grad.javaapi.service;


import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class DogsHandlerTest {

    private DogsRepository itsDogRepo = new DogsRepositoryStub();
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one(){


        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );

        long actualResult = cut.getNoOfDogs();
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public  void  add_several_dogs_return_number_of_dogs_match_number_added(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Paul");
        cut.addDog(theDog);
        Dog secondDog = new Dog();
        secondDog.setName("Cristi");
        cut.addDog(secondDog);
        Dog thirdDog = new Dog();
        thirdDog.setName("Rex");
        cut.addDog(thirdDog);
        long actualResult = cut.getNoOfDogs();
        int expectedResult = 3;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMultipleDogByName() {
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Paul");
        cut.addDog(theDog);
        Dog secondDog = new Dog();
        secondDog.setName("Paul");
        cut.addDog(secondDog);
        Dog thirdDog = new Dog();
        thirdDog.setName("Rex");
        cut.addDog(thirdDog);
        Dog myDog = cut.getDogByName("Paul");
        assertNull(myDog);
    }
    @Test
    public void getSingleDogByName(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Paul");
        cut.addDog(theDog);
        Dog secondDog = new Dog();
        secondDog.setName("Cristi");
        cut.addDog(secondDog);
        Dog thirdDog = new Dog();
        thirdDog.setName("Rex");
        cut.addDog(thirdDog);
        Dog myDog = cut.getDogByName("Cristi");
        assertEquals(myDog, secondDog);

    }

    @Test
    public void getDogById(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Paul");
        cut.addDog(theDog);
        Dog secondDog = new Dog();
        secondDog.setName("Cristi");
        long id = cut.addDog(secondDog);
        Dog thirdDog = new Dog();
        thirdDog.setName("Rex");
        cut.addDog(thirdDog);

        Dog myDog = cut.getDogById(id);
        assertEquals(myDog,secondDog);
    }

    @Test
    public void getNonExistingDogById(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Paul");
        cut.addDog(theDog);
        Dog secondDog = new Dog();
        secondDog.setName("Cristi");
        Dog thirdDog = new Dog();
        thirdDog.setName("Rex");
        cut.addDog(thirdDog);

        Dog myDog = cut.getDogById(1999);
        assertNull(myDog);
    }
    @Test
    public void updateDogDetails(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Paul");
        cut.addDog(theDog);
        Dog secondDog = new Dog();
        secondDog.setName("Cristi");

        Dog myDog = new Dog();
        myDog.setName("Azorel");
        long id = cut.updateDetails(myDog);

    }




}