package com.anythy.two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pig")
public class PigController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, from app-two's pig.";
    }
}
