package com.example.GithubActionTest.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "TEST Successful.";
    }

    @GetMapping("test-2")
    public String anotherTest(){
        return "TEST-2 Successful.";
    }
}
