package com.shoppingcart.repository;

import java.util.List;

import com.shoppingcart.models.Course;

public interface ShoppingCarDAO {
  List<Course> getCourses();
  void addCourse(int id);
  void deleteCourse(int i);  
  void cleanListCourse();
}
