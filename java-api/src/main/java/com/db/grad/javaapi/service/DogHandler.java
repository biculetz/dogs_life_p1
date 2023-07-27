package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import java.util.List;

public class DogHandler {
    private DogsRepository itsDogsRepo;
    public DogHandler(DogsRepository repo) {
        itsDogsRepo = repo;
    }

    public long addDog(Dog theDog) {
        return itsDogsRepo.save(theDog);
    }

    public long getNoOfDogs() {
        return itsDogsRepo.count();
    }

    public Dog getDogByName(String name) {
        Dog dog = new Dog();
        dog.setName(name);
        if(itsDogsRepo.findByName(dog).size()>1)
           return null;
        return itsDogsRepo.findByName(dog).get(0);
    }

    public Dog getDogById(long id) {
        if(itsDogsRepo.existsById(id))
            return itsDogsRepo.findById(id);
        return null;
    }
}
