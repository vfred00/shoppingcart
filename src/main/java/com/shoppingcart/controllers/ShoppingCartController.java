package com.shoppingcart.controllers;

import java.util.List;

import com.shoppingcart.models.Course;
import com.shoppingcart.services.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("api/")
public class ShoppingCartController {
  
  private ShoppingCartService shoppingCartService;
  
  @Autowired
  public ShoppingCartController(ShoppingCartService shoppingCartService) {
    this.shoppingCartService = shoppingCartService;
  }

  @PostMapping("deleteCourse/{id}")
  public void deleteCourse(@PathVariable int id){
    shoppingCartService.deleteCourse(id);    
  }
  
  @PostMapping("addCourse/{id}")
  public void addCourse(@PathVariable int id){
    shoppingCartService.addCourse(id);
  }
  
  @PostMapping("getCourses/{id}")
  public ResponseEntity<List<Course>> getCourses(@PathVariable int id){
    return new ResponseEntity<>(shoppingCartService.getCourses(), HttpStatus.OK);
  }

  @PostMapping("cleanListCourse/")
  public void cleanListCourse(){    
    shoppingCartService.cleanListCourse();
  }
}
