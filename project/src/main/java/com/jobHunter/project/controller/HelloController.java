package com.jobHunter.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobHunter.project.service.error.IdInvalidException;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHelloWorld() throws IdInvalidException {
        if (true)
            throw new IdInvalidException("check mate hoidanit");
        return "Hello World (Hỏi Dân IT & Eric)";
    }
}
