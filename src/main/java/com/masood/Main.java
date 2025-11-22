package com.masood;

import com.masood.modules.m_4.configuration.Config;
import com.masood.modules.m_4.entities.Comment;
import com.masood.modules.m_4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {



        var mApplicationContext = new AnnotationConfigApplicationContext(Config.class);

        var commentService = mApplicationContext.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Masood");
        comment.setText("This is my second Comment");

        commentService.publishComment(comment);


    }
}