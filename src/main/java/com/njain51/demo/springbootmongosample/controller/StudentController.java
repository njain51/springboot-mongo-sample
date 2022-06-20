package com.njain51.demo.springbootmongosample.controller;


import com.njain51.demo.springbootmongosample.model.Student;
import com.njain51.demo.springbootmongosample.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 What this program snippet doing?
 **/
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;


    @GetMapping("/home")
    public String showHomePage(){
        return "This is my home";
    }

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student){

         Student stu = this.studentRepository.save(student); // it will save student object in Database and also we assign it to stu.
         return ResponseEntity.ok(stu);
    }


    @GetMapping("/student")
    public ResponseEntity<?> getStudent(){

        return ResponseEntity.ok(this.studentRepository.findAll());
    }


}
