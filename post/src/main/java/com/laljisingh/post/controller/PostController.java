package com.laljisingh.post.controller;

import com.laljisingh.post.model.Post;
import com.laljisingh.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping("/post/add")
    public String addPost(@RequestBody Post post){
        postService.addPost(post);
        return post.toString();
    }
}
