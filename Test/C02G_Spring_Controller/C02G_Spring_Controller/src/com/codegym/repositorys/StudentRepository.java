package com.codegym.repositorys;

import com.codegym.models.Student;

public interface StudentRepository {

    void save(Student student);
    Student findById(Integer id);
}
