package com.diwanshu.springdemo.student;

import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
//@Primary
public class DBStudentService implements StudentService{

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(String email) {
        repository.deleteByEmail(email);
    }
}
