package com.example.catsgramapplication.controller;

import com.example.catsgramapplication.model.Post;
import com.example.catsgramapplication.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;


    @GetMapping("/posts")
    public List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/posts/{postId}")
    public Post findById(@PathVariable int postId) {
        return postService.findById(postId);
    }

    @PostMapping(value = "/post")
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }
}
