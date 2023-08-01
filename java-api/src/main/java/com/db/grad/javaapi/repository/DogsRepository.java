package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogsRepository extends JpaRepository<Dog, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM dogs")
    List<Dog> getAllDogs();

    @Query(nativeQuery = true, value = "SELECT * FROM dogs WHERE name=:dogsName")
    Dog getDogByName(String dogsName);

    @Query(nativeQuery = true, value = "SELECT * FROM dogs WHERE id=:uniqueId")
    Dog getDogById(long uniqueId);

    /*
    Dog save(Dog theDog );
    Dog  findById( long id );
    List<Dog> findByName(Dog theDog );
    void delete(Dog theDog );
    long count();
    boolean existsById( long id );

    // Additional admin functionality
    void    deleteAll();*/
}
