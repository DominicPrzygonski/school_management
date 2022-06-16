package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Student;
import za.ac.cput.services.Student.StudentServiceImpl;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/Student")
    public Student saveStudent(@RequestBody Student studentFactory){
        return studentService.save(studentFactory);
    }
}