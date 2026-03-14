package com.example.springstarthere.proxy;

import com.example.springstarthere.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
