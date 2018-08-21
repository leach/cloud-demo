package com.anythy.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class ProductController {

    @GetMapping("/show")
    @PreAuthorize("hasRole('USER')")
    public String show() {
        return "product";
    }
}
