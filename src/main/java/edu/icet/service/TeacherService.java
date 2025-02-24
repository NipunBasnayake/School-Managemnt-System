package edu.icet.service;

import edu.icet.dto.Teacher;
import edu.icet.entity.TeacherEntity;

import java.util.List;

public interface TeacherService {

    void add(TeacherEntity teacher);

    List<Teacher> getAll();

    Teacher findById(int id);

    List<Teacher> findByName(String name);

    void update(Teacher teacher);

    void delete(int id);
}
