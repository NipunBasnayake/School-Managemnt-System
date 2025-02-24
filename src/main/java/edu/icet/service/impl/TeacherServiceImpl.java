package edu.icet.service.impl;

import edu.icet.dto.Teacher;
import edu.icet.entity.TeacherEntity;
import edu.icet.repository.TeacherRepository;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    final TeacherRepository teacherRepository;
    final ModelMapper modelMapper;

    @Override
    public void add(TeacherEntity teacher) {
        teacherRepository.save(modelMapper.map(teacher, TeacherEntity.class));
    }

    @Override
    public List<Teacher> getAll() {
        List<TeacherEntity> teacherEntities = teacherRepository.findAll();
        List<Teacher> teachers = new ArrayList<>();
        teacherEntities.forEach(teacher -> {
           teachers.add(modelMapper.map(teacher, Teacher.class));
        });
        return teachers;
    }

    @Override
    public Teacher findById(int id) {
        return modelMapper.map(teacherRepository.findById(id).get(), Teacher.class);
    }

    @Override
    public List<Teacher> findByName(String name) {
        List<TeacherEntity> teacherEntities = teacherRepository.findByName(name);
        List<Teacher> teachers = new ArrayList<>();
        teacherEntities.forEach(teacher -> {
            teachers.add(modelMapper.map(teacher, Teacher.class));
        });
        return teachers;
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.save(modelMapper.map(teacher, TeacherEntity.class));
    }

    @Override
    public void delete(int id) {
        teacherRepository.deleteById(id);
    }
}
