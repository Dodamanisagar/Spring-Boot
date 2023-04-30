package com.Sagar.CRUDdemo;

import com.Sagar.CRUDdemo.Dao.StudentDAO;
import com.Sagar.CRUDdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruDdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruDdemoApplication.class, args);
    }

    @Bean
    /*Executed after the Spring beans have been loaded*/
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

        return runner -> {
            //Write here your custom code

            // createStudent(studentDAO);

            createMultipleStudents(studentDAO);

            //readStudent(studentDAO);

            //queryForStudents(studentDAO);'

           //queryForStudentsByLastName(studentDAO);

            //updaetStudent(studentDAO);

            //deleteStudent(studentDAO);

            //deleteAllStudent(studentDAO);



        };
    }

    private void deleteAllStudent(StudentDAO studentDAO) {
        System.out.println("Deleting all Students");
        int numRowsDeleted=studentDAO.deletAll();
        System.out.println("Deleted row count: "+numRowsDeleted);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId=3;
        System.out.println("Deleting student Id:"+studentId);
        studentDAO.delete(studentId);
    }

    private void updaetStudent(StudentDAO studentDAO) {
        //retrieve student based on the id:primary key
        int studentId=1;
        System.out.println("getting student with id: "+studentId);
        Student myStudent=studentDAO.findById(studentId);

        //change first name to scooby
        System.out.println("Updateing student... ");
        myStudent.setFirstName("Basavaraj");

        //update the student
        studentDAO.update(myStudent);

        //display the updated student
        System.out.println("Updated student: "+myStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        //get list of students
        List<Student> theStuedents = studentDAO.findByLastName("Dodamani");

        //display list of students
        for (Student tempStudents : theStuedents
        ) {
            System.out.println(tempStudents);

        }
    }

    private void queryForStudents(StudentDAO studentDAO) {
        //get a list of the Students
        List<Student> theStudents = studentDAO.findALl();

        //display list of students
        for (Student tempStudent : theStudents
        ) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        //create a student object
        System.out.println("creating new student object:....");
        Student tempStudent1 = new Student("Basavaraj", "Dodamani", "basavarajdodamani235@gmail.com");

        //save the student
        System.out.println("Saving the student....");
        studentDAO.save(tempStudent1);

        //display id of the student
        int theId = tempStudent1.getId();
        System.out.println("Saved student. Generated id:" + theId);

        //retrieve student based on the id: primary key
        System.out.println("Retrieving student with id:" + theId);
        Student myStudent = studentDAO.findById(theId);

        //display student
        System.out.println("Found the student:" + myStudent);
    }

    private void createMultipleStudents(StudentDAO multipleStudentDAO) {
        //create multiple student
        System.out.println("creating 3 student objects:....");
        Student tempStudent1 = new Student("Basavaraj", "Dodamani", "basavarajdodamani235@gmail.com");
        Student tempStudent2 = new Student("Suaj", "Dodamani", "surajdodamani235@gmail.com");
        Student tempStudent3 = new Student("John", "D", "john235@gmail.com");

        //save the student objects
        System.out.println("Saving the students...");
        multipleStudentDAO.save(tempStudent1);
        multipleStudentDAO.save(tempStudent2);
        multipleStudentDAO.save(tempStudent3);
    }

    private void createStudent(StudentDAO studentDAO) {
        //create the student object
        System.out.println("creating new student object:....");
        Student tempStudent = new Student("Sagar", "Dodamani", "sagardodamani235@gmail.com");

        //save the student object
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        //display id of the saved student
        System.out.println("saved student. Generated Id: " + tempStudent.getId());
    }
}
