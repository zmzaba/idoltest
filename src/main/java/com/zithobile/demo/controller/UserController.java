package com.zithobile.demo.controller;

import com.zithobile.demo.model.User;
import com.zithobile.demo.service.UserServiceStub;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return UserServiceStub.getAllUsers();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return UserServiceStub.addUser(user);
    }

    @PutMapping("updateUser/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        return UserServiceStub.updateUser(userId, user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public User deleteUser(@PathVariable Long userId) {
        return UserServiceStub.deleteUser(userId);
    }

}
