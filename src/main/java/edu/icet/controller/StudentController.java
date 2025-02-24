package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {
    final StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/searchById/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @GetMapping("/searchByName/{name}")
    public List<Student> getStudentByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student) {
        studentService.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.delete(id);
    }
}
