package com.diwanshu.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Diwanshu",
                        "Kumar",
                        LocalDate.now(),
                        "kumardiwanshu00@gmail.com",
                        22
                ),
                new Student(
                        "Ritesh",
                        "Kumar",
                        LocalDate.now(),
                        "kumarritesh789@gmail.com",
                        22
                )
        );
    }
}
