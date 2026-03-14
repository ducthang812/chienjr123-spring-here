package com.example.springstarthere.repository.impl;

import com.example.springstarthere.model.Comment;
import com.example.springstarthere.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
