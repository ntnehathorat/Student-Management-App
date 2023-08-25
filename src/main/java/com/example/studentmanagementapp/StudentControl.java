package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentControl {
@Autowired
StudentService studentService;
   @GetMapping("/get")
   public Student getStudent(@RequestParam("q") int regNo)
    {

       return studentService.getStudent(regNo);
    }

   @PostMapping("/add")
   public String addStudent(@RequestBody Student student)
   {
       return studentService.addStudent(student);
   }

 @GetMapping("/getByPath/{id}")
   public Student getStudentUsingPath(@PathVariable ("id") int regNo)
   {
       return  studentService.getStudentUsingPath(regNo);

   }

   @PutMapping("/update-age")
   public Student updateAge(@RequestParam("id") int regNo, @RequestParam("age") int newAge)
   {
       return studentService.updateAge(regNo,newAge);
   }

}


