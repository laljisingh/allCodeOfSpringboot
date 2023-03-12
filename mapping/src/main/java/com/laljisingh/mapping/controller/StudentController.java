package com.laljisingh.mapping.controller;


import com.laljisingh.mapping.service.StudentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/add-student")
    public String addStudent(@RequestBody String newStudent){
        JSONObject json = new JSONObject(newStudent);
//        Student student = setStudent(json);
        studentService.addStudent(newStudent);
        return "Student Addes";
    }

//    rivate Student setStudent(JSONObject json) {
//        return json;
//    }p
}
