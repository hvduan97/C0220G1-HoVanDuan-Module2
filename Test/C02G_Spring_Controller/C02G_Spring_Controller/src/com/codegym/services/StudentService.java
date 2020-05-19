package com.codegym.services;

import com.codegym.models.Student;

public interface StudentService {

    void save(Student student);

    Student findById(Integer id);
}
