package com.example.piroweek4.dto.request;

import com.example.piroweek4.entity.PostStatus;
import lombok.Getter;


@Getter
public class PostUpdateReq {

    private String title;

    private String content;

    private PostStatus status;
}