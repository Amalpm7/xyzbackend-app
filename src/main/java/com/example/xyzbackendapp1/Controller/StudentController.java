package com.example.xyzbackendapp1.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @PostMapping("/studentEntry")
    public  String studentEntry(){
        return "Test";
    }

}
