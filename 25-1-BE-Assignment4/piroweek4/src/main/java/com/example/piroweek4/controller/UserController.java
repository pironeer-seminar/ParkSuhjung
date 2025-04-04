package com.example.piroweek4.controller;


import com.example.piroweek4.dto.Requset.UserCreateReq;
import com.example.piroweek4.dto.Response.UserCreateRes;
import com.example.piroweek4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public UserCreateRes create(@RequestBody UserCreateReq req) {
        return userService.create(req);
    }

}