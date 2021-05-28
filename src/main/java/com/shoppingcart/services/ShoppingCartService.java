package com.shoppingcart.services;

import java.util.List;

import com.shoppingcart.models.Course;

public interface ShoppingCartService {
  List<Course> getCourses();
  void deleteCourse(int i);
  void cleanListCourse();
  void addCourse(int id);
}
