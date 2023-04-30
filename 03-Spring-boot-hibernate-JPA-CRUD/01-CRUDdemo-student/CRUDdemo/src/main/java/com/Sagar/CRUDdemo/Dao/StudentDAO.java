package com.Sagar.CRUDdemo.Dao;

import com.Sagar.CRUDdemo.entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findALl();
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deletAll();


}
