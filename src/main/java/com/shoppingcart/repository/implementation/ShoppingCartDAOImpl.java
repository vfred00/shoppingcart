package com.shoppingcart.repository.implementation;

import java.util.List;

import javax.sql.DataSource;

import com.shoppingcart.models.Course;
import com.shoppingcart.repository.DAO;
import com.shoppingcart.repository.ShoppingCarDAO;

public class ShoppingCartDAOImpl extends DAO implements ShoppingCarDAO {  
   
  public ShoppingCartDAOImpl(DataSource dataSource) {
    super(dataSource);    
  }

  @Override
  public List<Course> getCourses() {    
    return null;
  }

  @Override
  public void deleteCourse(int i) {    
    
  }

  @Override
  public void addCourse(int id) {    
    
  }

  @Override
  public void cleanListCourse() {    
    
  }

  

}
