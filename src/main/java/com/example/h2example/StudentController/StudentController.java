package com.example.h2example.StudentController;

import com.example.h2example.Student.Student;
import com.example.h2example.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    // creating a GET mapping that retrieves all the Student detail from database
    @GetMapping("/student")
    private List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    // creating a GET mapping that retrieves the detail of a specific Student
    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id){
        return studentService.getStudentByID(id);
    }

    // creating a DELETE mapping that deletes the detail of a specific Student
    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id){
        studentService.delete(id);
    }

    // creating a POST mapping that Post the Student detail to the database
    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student.getId();
    }
}
