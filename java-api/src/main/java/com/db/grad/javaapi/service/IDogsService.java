package com.db.grad.javaapi.service;
import java.util.List;
import com.db.grad.javaapi.model.Dog;

public interface IDogsService
{
    public List<Dog> getAllDogs();

    public Dog addDog(Dog theDog);

    public long getNoOfDogs();

    public boolean removeDog(long uniqueId);

    public Dog getDogById(long uniqueId);

    public Dog getDogByName(String dogsName );

    public Dog updateDogDetails(Dog dogToUpdate);
}