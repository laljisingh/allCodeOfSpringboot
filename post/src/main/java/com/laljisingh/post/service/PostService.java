package com.laljisingh.post.service;

import com.laljisingh.post.model.Post;
import com.laljisingh.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public void addPost(Post post) {
        postRepository.save(post);
    }
}
