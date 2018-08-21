package com.anythy.user.mapper;

import com.anythy.user.entity.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepository {
    public static Map<String, Object> getUsers(){
        if(TempData.getInstance().getData("users") == null){
            return new HashMap<>(1);
        }
        Map<String, Object> users = (Map<String, Object>) TempData.getInstance().getData("users");
        return users;
    }

    public static void putUsers(Map<String, Object> users){
        TempData.getInstance().putData("users", users);
    }

    public static User findByUsername(String username) {
        Map<String, Object> users = getUsers();
        if(users.containsKey(username)){
            return (User) users.get(username);
        }
        return null;
    }

    public static User insert(User userToAdd) {
        userToAdd.setLastPasswordResetDate(new Date());
        String uuid = UUID.randomUUID().toString();
        userToAdd.setId(uuid.substring(uuid.length() - 8));

        Map<String, Object> users = getUsers();
        users.put(userToAdd.getUsername(), userToAdd);
        putUsers(users);
        return userToAdd;
    }

}
