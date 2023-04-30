package com.Sagar.CRUDdemo.Dao;

import com.Sagar.CRUDdemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
 @Repository:-
* 1.Specialized annotation for repositories
* 2.Supports component scanning
* 3.Translates JDBC exceptions */
@Repository
public class StudentDAOImpl implements StudentDAO {
    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional//Automatically begins and ends a transaction for your JPA code
    public void save(Student theStudent) {
     entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findALl() {
        //create query
        /*TypedQuery<Student> theQuery=entityManager.createQuery("Give name of JPA Entity.. the class name",Student.class);*/

        //TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student",Student.class);


        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student",Student.class);

        //return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        //create query
      /*  TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student where lastName=:theData(JPQL named paremetrs are prefixed with a colon,Think of this as placeholder that is filled in later)",Student.class);*/
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student where lastName=:theData",Student.class);

        //set query paremeters
        theQuery.setParameter("theData",theLastName);

        //return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional//Only not used for Query part
    public void update(Student theStudent) {
     entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        //retrieve the student
        Student theStudent=entityManager.find(Student.class,id);

        //delete student
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deletAll() {
        int numRowsDeleted=entityManager.createQuery("delete from Student").executeUpdate();
        return numRowsDeleted;
    }
}
