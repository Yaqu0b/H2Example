package com.example.h2example.StudentRepo;

import com.example.h2example.Student.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {


}
