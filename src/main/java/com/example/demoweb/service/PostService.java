package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> posts;

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public PostService() {
        this.posts = new ArrayList<>();
        create((long)posts.size(),"Never Gonna Give You Up, never gonna let you down\n", new Date());
    }

    public void create(Long id, String text, Date creationDate) {
        posts.add(new Post(id, text, creationDate));
    }
}
