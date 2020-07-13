package com.google.sps.data;

import java.util.*;

public class Comment {
    private final long id;
    private final String comment_text;
    private final String name;
    private final String email;
    private final long timestamp;

    public Comment(long id, String comment_text, String name, String email, long timestamp){
        this.id = id;
        this.comment_text = comment_text;
        this.name = name;
        this.email = email;
        this.timestamp = timestamp;
    }

    public long getId(){
        return id;
    }

    public String getCommentText(){
        return comment_text;
    }
    
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public long Timestamp(){
        return timestamp;
    }

}