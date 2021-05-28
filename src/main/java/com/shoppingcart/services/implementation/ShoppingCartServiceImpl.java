package com.shoppingcart.services.implementation;

import java.util.List;

import com.shoppingcart.models.Course;
import com.shoppingcart.repository.ShoppingCarDAO;
import com.shoppingcart.services.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
  private ShoppingCarDAO shoppingCarDAO;

  @Autowired
  public ShoppingCartServiceImpl(ShoppingCarDAO shoppingCarDAO){
    this.shoppingCarDAO = shoppingCarDAO;
  }
  
  @Override
  public List<Course> getCourses() {    
    return shoppingCarDAO.getCourses();
  }

  @Override
  public void deleteCourse(int i) {    
    shoppingCarDAO.deleteCourse(i);
  }

  @Override
  public void addCourse(int id) {    
    shoppingCarDAO.addCourse(id);
  }

  @Override
  public void cleanListCourse() {    
    shoppingCarDAO.cleanListCourse();
  }  
}
