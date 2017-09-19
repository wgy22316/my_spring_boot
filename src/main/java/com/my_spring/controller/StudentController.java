package com.my_spring.controller;

import com.my_spring.entity.Student;
import com.my_spring.repository.StudentReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentReposity studentReposity;

    @Autowired
    private void setStudentReposity(StudentReposity studentReposity){
        this.studentReposity = studentReposity;
    }

    @GetMapping(value = "/getStudentById")
    public Student getStudentById(@RequestParam(value = "id",required = false) Integer id){
        System.out.println("id=:"+id);
        return studentReposity.getStudentById(id);
    }

    @GetMapping(value = "/findStudent")
    public Student studentList(@RequestParam(value = "name",required = false) String name){
        return studentReposity.findStudent(name);
    }


}
