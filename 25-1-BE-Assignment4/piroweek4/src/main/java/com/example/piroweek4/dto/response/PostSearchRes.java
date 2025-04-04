package com.example.piroweek4.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class PostSearchRes {

    private Long userId;
    private String postId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
}


