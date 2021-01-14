package com.example.EmailActivation.controller;

import com.example.EmailActivation.model.Applicant;
import com.example.EmailActivation.model.User;
import com.example.EmailActivation.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private userRepository userRepository;

    @GetMapping("/all")
    public List<User> getStudent() {
        return userRepository.getAll();
    }

    @RequestMapping(value="/{username}",method = RequestMethod.GET)
    public User getOneByUsername(@PathVariable String username)
    {
        User user = userRepository.getUserByUsername(username);
        if(user == null)
        {
            return new User();
        }
        return user;
    }

    @PostMapping()
    public User addUser(@RequestBody User user){
        User last = userRepository.getLast();
        if(last!=null) {
            System.out.print(last.getId());
            user.setId(last.getId()+1);
            User save = userRepository.save(user);
            return userRepository.getOne(save.getId());
        }
        User save = userRepository.save(user);
        return userRepository.getOne(save.getId());
    }
}
