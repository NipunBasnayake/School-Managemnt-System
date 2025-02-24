package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;
    final ModelMapper modelMapper;

    @Override
    public void add(Student student) {
        studentRepository.save(modelMapper.map(student, StudentEntity.class));
    }

    @Override
    public List<Student> findAll() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        List<Student> students = new ArrayList<>();
        studentEntities.forEach(studentEntity -> students.add(modelMapper.map(studentEntity, Student.class)));
        return students;
    }

    @Override
    public Student findById(int id) {
        return modelMapper.map(studentRepository.findById(id).get(), Student.class);
    }

    @Override
    public List<Student> findByName(String name) {
        List<StudentEntity> studentEntities = studentRepository.findByName(name);
        List<Student> students = new ArrayList<>();
        studentEntities.forEach(studentEntity -> students.add(modelMapper.map(studentEntity, Student.class)));
        return students;
    }

    @Override
    public void update(Student student) {
        studentRepository.save(modelMapper.map(student, StudentEntity.class));
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}
