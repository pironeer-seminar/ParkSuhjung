package com.example.piroweek4.controller;

import com.example.piroweek4.dto.response.PostSearchRes;
import com.example.piroweek4.dto.request.PostCreateReq;
import com.example.piroweek4.dto.request.PostUpdateReq;
import com.example.piroweek4.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // 생성
    @PostMapping("")
    public Long create(@RequestBody PostCreateReq req) {
        return postService.create(req);
    }

    // 목록조회
    @GetMapping("")
    public List<PostSearchRes> search() {
        return postService.search();
    }

    // 단일조회
    @GetMapping("/{postId}")
    public PostSearchRes detail(
            @PathVariable("postId") Long postId
    ) {
        return postService.detail(postId);
    }

    // 수정
    @PutMapping("/{postId}")
    public Long update(
            @PathVariable("postId") Long postId,
            @RequestBody PostUpdateReq req) {
        return postService.update(postId, req);
    }

    // 삭제
    @DeleteMapping("/{postId}")
    public Long delete(
            @PathVariable("postId") Long postId
    ) {
        return postService.delete(postId);
    }
}