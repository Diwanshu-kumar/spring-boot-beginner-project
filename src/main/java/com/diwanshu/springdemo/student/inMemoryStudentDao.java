package com.diwanshu.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class inMemoryStudentDao {
    private final List<Student> STUDENTS = new ArrayList<>();
    public Student save(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public List<Student> findAllStudents() {
        return STUDENTS;
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream()
                        .filter(student -> student.getEmail().equals(email))
                        .findFirst()
                        .orElse(null);
    }

    public Student update(Student student) {
        var studentIndex = IntStream.range(0,STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex > -1){
            STUDENTS.set(studentIndex,student);
            return student;
        }
        return null;
    }

    public void delete(String email) {
        var student = findByEmail(email);
        if(student!=null){
            STUDENTS.remove(student);
        }
    }
}
