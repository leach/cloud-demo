package com.anythy.one.controller;

import com.anythy.one.feign.AppTwoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dog")
public class DogController {

    @Autowired
    private AppTwoApi appTwoApi;

    @RequestMapping("hello")
    public String hello(){
        return appTwoApi.hello();
    }
}
