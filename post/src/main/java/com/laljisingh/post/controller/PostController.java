package com.laljisingh.post.controller;

import com.laljisingh.post.model.Post;
import com.laljisingh.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping("/post/add")
    public String addPost(@RequestBody Post post){
        postService.addPost(post);
        return post.toString();
    }
    @GetMapping("/get-post")
    public ResponseEntity<String> getPost(){
        List<Post> post = postService.getPost();
        return new ResponseEntity<String>(post.toString(), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable Integer id){
        postService.deletePost(id);
        return "deleted";
    }
    @PutMapping("/update-post/{id}")
    public ResponseEntity<String> updatePost(@PathVariable Integer id, @RequestBody Post newPost){
        Post post = postService.updatePost(id, newPost);
        return new ResponseEntity<String>("Updated"+post, HttpStatus.OK);
    }
}
