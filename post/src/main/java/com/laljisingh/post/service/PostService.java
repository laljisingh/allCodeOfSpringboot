package com.laljisingh.post.service;

import com.laljisingh.post.model.Post;
import com.laljisingh.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public void addPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> getPost() {
        return postRepository.findAll();
    }


    public void deletePost(Integer id) {
        postRepository.deleteById(id);
    }
}
