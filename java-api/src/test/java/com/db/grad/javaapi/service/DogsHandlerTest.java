package com.db.grad.javaapi.service;


import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

}
