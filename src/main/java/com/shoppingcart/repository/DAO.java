package com.shoppingcart.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAO extends JdbcTemplate {

  public DAO(DataSource dataSource){
    setDataSource(dataSource);
  }
}
