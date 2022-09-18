package com.example.demoweb.model;

public class Post {
    private final String text;
    private final Integer likes;

    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}
