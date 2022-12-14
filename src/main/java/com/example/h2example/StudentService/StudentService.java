package com.example.h2example.StudentService;

import com.example.h2example.Student.Student;
import com.example.h2example.StudentRepo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudent(){
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }
    // getting a specific record
    public Student getStudentByID(int id){
        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }
    // deleting a specific record //
    public void delete(int id){
        studentRepository.deleteById(id);
    }
}
