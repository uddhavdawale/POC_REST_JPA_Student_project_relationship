package com.ud.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ud.demo.model.User;
import com.ud.demo.repository.UserRepository;
import com.ud.demo.service.UserService;

@RestController

public class UserController {


    private UserService userService;

    private UserRepository userRepository;


    public UserController(UserService userService, UserRepository userRepository) {

        this.userService = userService;

        this.userRepository = userRepository;

    }

    //

    @PostMapping("/student/create")

    public ResponseEntity<Object> createUser(@RequestBody User user) {

        return userService.createUser(user);

    }

    @GetMapping("/user/details/{id}")

    public User getUser(@PathVariable Long id) {

        if(userRepository.findById(id).isPresent())

            return userRepository.findById(id).get();

        else return  null;

    }

    @GetMapping("/user/all")

    public List<User> getUsers() {

        return userRepository.findAll();

    }

    @PutMapping("/user/update/{id}")

    public ResponseEntity<Object> updateUser(@PathVariable Long id, @RequestBody User user) {

        return userService.updateUser(user, id);

    }

    @DeleteMapping("user/delete/{id}")

    public ResponseEntity<Object> deleteUser(@PathVariable Long id) {

        return userService.deleteUser(id);

    }

}
