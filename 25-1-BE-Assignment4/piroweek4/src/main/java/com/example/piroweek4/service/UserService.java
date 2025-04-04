package com.example.piroweek4.service;

import com.example.piroweek4.dto.request.UserCreateReq;
import com.example.piroweek4.entity.User;
import com.example.piroweek4.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Long create(UserCreateReq req) {
        User user = User.create(req.getName());
        user = userRepository.save(user);

        return user.getId();
    }
}