package com.FitnessAPP.controller;

import com.FitnessAPP.Repos.WorkoutRepo;
import com.FitnessAPP.Service.UserService;
import com.FitnessAPP.Service.WorkoutService;
import com.FitnessAPP.UserInfo.User;
import com.FitnessAPP.Repos.UserRepo;
import com.FitnessAPP.UserInfo.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class UserController {
    @Autowired
    UserRepo userRepo;
    @Autowired
    UserService userService;
    @Autowired
    WorkoutRepo workoutRepo;


    //PostMapping
    @PostMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> userCreation(@RequestBody(required = false) User user) throws URISyntaxException {
        User task = userRepo.save(User.builder().first_name(user.getFirst_name()).last_name(user.getLast_name())
                .age(user.getAge()).email(user.getEmail()).address(user.getAddress()).build());
        return ResponseEntity.created(new URI("/user" + task.getId())).body(task);
    }

    @PostMapping(path = "/workout", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<Workout> workoutBuilder(@ModelAttribute Workout workout) throws URISyntaxException {
        Workout task = workoutRepo.save(workout);
        return ResponseEntity.created(new URI("/workout" + task.getId())).body(task);
    }








    @GetMapping(path = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getUser(@PathVariable Long id) {
        Optional<User> user = userRepo.findById(id);
        return user;
    }



    @DeleteMapping(path = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }


    @GetMapping(path = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<User> getUserByEmail(@PathVariable String email) {
        Optional<User> getUserByEmail = userRepo.findByEmail(email);
        return getUserByEmail;
    }
//    @GetMapping(path = "index", produces = MediaType.TEXT_HTML_VALUE)
//    public String getHtml(Model model){
//        model.addAttribute("message","Hello");
//        workoutRepo.save(model)
//        return "index";
//    }


}















