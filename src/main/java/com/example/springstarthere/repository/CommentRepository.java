package com.example.springstarthere.repository;

import com.example.springstarthere.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
