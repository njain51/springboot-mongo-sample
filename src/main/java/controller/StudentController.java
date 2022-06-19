package controller;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 6/18/2022, Saturday
 **/

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repo.StudentRepository;

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


    @GetMapping("/getstudent")
    public ResponseEntity<?> getStudent(){

        return ResponseEntity.ok(this.studentRepository.findAll());
    }


}
