package com.learn.praneeth.springPracticeProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> users(){
        return List.of(new User("Praneeth" , 25));
    }
}
