package com.example.apiRestPort.controllers;

import com.example.apiRestPort.model.User;
import com.example.apiRestPort.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getAllProducts (){
    List<User> users = userService.obtenerTodos();

    return "Hola esta es la api";
   // return  new ResponseEntity<>(users, HttpStatus.OK);
     };

}
