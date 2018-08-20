package com.anythy.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
@PreAuthorize("hasRole('USER')")
public class ProductController {

    @GetMapping
    public String getUsers() {
        return "product";
    }
}
