package com.example.springstarthere.service;

import com.example.springstarthere.model.Comment;
import com.example.springstarthere.proxy.CommentNotificationProxy;
import com.example.springstarthere.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
                           CommentRepository commentRepository,
                           CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
