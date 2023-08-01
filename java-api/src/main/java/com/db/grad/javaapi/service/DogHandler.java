package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;
import java.util.Optional;

@Service
public class DogHandler implements IDogsService
{
    private final DogsRepository itsDogsRepo;

    @Autowired
    public DogHandler( DogsRepository dogRepo )
    {
        itsDogsRepo = dogRepo;
    }

    @Override
    public List<Dog> getAllDogs() {
        return itsDogsRepo.getAllDogs();
    }

    @Override
    public Dog addDog(Dog theDog) {
        return null;
    }

    @Override
    public long getNoOfDogs() {
        List<Dog> allTheDogs = itsDogsRepo.getAllDogs();
        return allTheDogs.size();
    }

    @Override
    public boolean removeDog(long uniqueId) {
        return false;
    }

    @Override
    public Dog getDogById(long uniqueId) {
        return itsDogsRepo.getDogById(uniqueId);
    }

    @Override
    public Dog getDogByName(String dogsName) {
        return itsDogsRepo.getDogByName(dogsName);
    }

    @Override
    public Dog updateDogDetails(Dog dogToUpdate) {
        return null;
    }


}
