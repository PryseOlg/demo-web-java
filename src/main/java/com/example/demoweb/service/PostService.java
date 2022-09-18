package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import java.util.ArrayList;

@org.springframework.stereotype.Service
public class PostService {
    private ArrayList<Post> posts;

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public PostService() {
        this.posts = new ArrayList<>();
        addPost("Never Gonna Give You Up, never gonna let you down\n", 176);
        addPost("Never gonna run around and desert you\n", 12);
        addPost("Never gonna make you cry, never gonna say goodbye", 3243);
    }

    public void addPost(String text, Integer likes) {
        posts.add(new Post(text, likes));
    }
}
