package com.data.controller;

import com.data.pojo.StudentInformation;
import com.data.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("StudentInfo")
    @ResponseBody
    public List<StudentInformation> getAllStudents() {
        List<StudentInformation> students=studentService.getAll();
        return students;

    }


}
