package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentService {

    List<Student> student=new ArrayList<>(List.of(
            new Student (1,"Ritam","JS"),
            new Student (2,"Yash","UK")

    ));
    
//    Student s1=new Student();
    @GetMapping("student")
    public List<Student> disp(){
        return student;

    }
    @PostMapping("students")
    public void addStud(@RequestBody Student student){
        student.add(student);
    }
}
