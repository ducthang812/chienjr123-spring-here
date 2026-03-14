package com.example.springstarthere.main;

import com.example.springstarthere.config.ProjectConfiguration;
import com.example.springstarthere.model.Comment;
import com.example.springstarthere.proxy.impl.EmailCommentNotificationProxy;
import com.example.springstarthere.repository.impl.DBCommentRepository;
import com.example.springstarthere.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}

