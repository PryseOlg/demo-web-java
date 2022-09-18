package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import java.util.ArrayList;
import java.util.Date;

@org.springframework.stereotype.Service
public class PostService {
    private ArrayList<Post> posts;

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public PostService() {
        this.posts = new ArrayList<>();
        create("Never Gonna Give You Up, never gonna let you down\n", new Date());
        create("Never gonna run around and desert you\n", new Date());
        create("Never gonna make you cry, never gonna say goodbye", new Date());
    }

    public void create(String text, Date creationDate) {
        posts.add(new Post(text, creationDate));
    }
}
