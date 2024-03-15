package com.diwanshu.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class inMemoryStudentService implements StudentService{

    private final inMemoryStudentDao dao;

    public inMemoryStudentService(inMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
