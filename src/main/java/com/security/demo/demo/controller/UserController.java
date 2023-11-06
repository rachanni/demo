package com.security.demo.demo.controller;

import com.security.demo.demo.dto.ProfileDto;
import com.security.demo.demo.entity.UserInfo;
import com.security.demo.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService usersService;

    @PostMapping("/register")
    public String register(@RequestBody UserInfo user){
        return usersService.register(user);
    }

    @GetMapping("/view-profile")
    public ProfileDto viewProfile() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return usersService.viewProfile(name);
    }

}
