package com.example.springstarthere.proxy.impl;

import com.example.springstarthere.model.Comment;
import com.example.springstarthere.proxy.CommentNotificationProxy;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy
        implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                + comment.getText());
    }
}