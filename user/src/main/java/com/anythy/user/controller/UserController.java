package com.anythy.user.controller;

import com.anythy.user.dto.UserDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@PreAuthorize("hasRole('ADMIN')")
public class UserController {

    @RequestMapping("/get/{uid}")
    public UserDTO getUserByUid(@PathVariable("uid") Long uid) {
        if(uid == null){
            return null;
        }
        return new UserDTO(1L, "dog");
    }
}
