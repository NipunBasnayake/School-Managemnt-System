package edu.icet.service;


import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);

    List<Student> findAll();

    Student findById(int id);

    List<Student> findByName(String name);

    void update(Student student);

    void delete(int id);
}
