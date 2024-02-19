package com.example.userservice.Controller;

import com.example.userservice.entities.User;
import com.example.userservice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=userServices.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable int userId){
        User user=userServices.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
       List<User> allUser= userServices.getAllUser();
       return ResponseEntity.ok(allUser);
    }
}
