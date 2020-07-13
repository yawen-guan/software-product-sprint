package com.google.sps.data;

public class Comment {
    private final String comment_text;
    private final String name;
    private final String email;

    public Comment(String comment_text, String name, String email){
        this.comment_text = comment_text;
        this.name = name;
        this.email = email;
    }

    public String getCommentText(){
        return comment_text;
    }
    
    public String getCommentName(){
        return name;
    }

    public String getCommentEmail(){
        return email;
    }

}