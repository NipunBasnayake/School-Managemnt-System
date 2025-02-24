package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.dto.Teacher;
import edu.icet.entity.TeacherEntity;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
@RequiredArgsConstructor
@CrossOrigin
public class TeacherController {

    final TeacherService teacherService;

    @PostMapping("/add")
    public void addTeacher(@RequestBody TeacherEntity teacher) {
        teacherService.add(teacher);
    }

    @GetMapping("/all")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAll();
    }

    @GetMapping("/searchById/{id}")
    public Teacher getTeacherById(@PathVariable int id) {
        return teacherService.findById(id);
    }

    @GetMapping("/searchByName/{name}")
    public List<Teacher> getTeacherByName(@PathVariable String name) {
        return teacherService.findByName(name);
    }

    @PutMapping("/update")
    public void updateTeacher(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTeacher(@PathVariable int id) {
        teacherService.delete(id);
    }
}
