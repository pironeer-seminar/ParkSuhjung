package com.example.piroweek4.service;


import com.example.piroweek4.controller.UserController;
import com.example.piroweek4.dto.Requset.UserCreateReq;
import com.example.piroweek4.dto.Response.UserCreateRes;
import com.example.piroweek4.entity.User;
import com.example.piroweek4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserCreateRes create(UserCreateReq req) {
        User user = User.create(req.getName());
        user = userRepository.save(user);

        return new UserCreateRes(user.getId());
    }
}
