package com.FitnessAPP.controller;

import com.FitnessAPP.Service.UserService;
import com.FitnessAPP.UserInfo.User;
import com.FitnessAPP.UserInfo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.Optional;


@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;
    @Autowired
    UserService userService;

    //PostMapping
    @PostMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> userCreation(@RequestBody(required = false) User user) throws URISyntaxException {
        User task = userRepo.save(User.builder().first_name(user.getFirst_name()).last_name(user.getLast_name())
                .age(user.getAge()).email(user.getEmail()).address(user.getAddress()).build());
        return ResponseEntity.created(new URI("/user" + task.getId())).body(task);
    }

    @GetMapping(path = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getUser(@PathVariable Long id) {
        Optional<User> getUser = userRepo.findById(id);
        return getUser;
    }

    @DeleteMapping(path = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(@PathVariable Long id) {
       userService.deleteUserById(id);
    }
}












