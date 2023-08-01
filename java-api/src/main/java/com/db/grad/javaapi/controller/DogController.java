package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.service.DogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

  private final DogHandler dh;

  @Autowired
  public DogController(DogHandler dh) {
    this.dh = dh;
  }

  @GetMapping("/")
  public String getWelcome() {
    return "Dogs API is up and running!";
  }

  @GetMapping("/all")
  public List<Dog> getAllDogs(){
    return dh.getAllDogs();
  }

  @GetMapping("/number")
  public int getNumberDogs(){
    return (int) dh.getNoOfDogs();
  }

  @GetMapping("/dogbyname")
  public Dog getDogByName(@RequestParam String name){
    return dh.getDogByName(name);
  }

  @GetMapping("/dogbyid")
  public Dog getDogById(@RequestParam int id){
    return dh.getDogById(id);
  }


}
