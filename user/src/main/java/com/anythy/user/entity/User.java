package com.anythy.user.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 */
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private List<String> roles;
}
