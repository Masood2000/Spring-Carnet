package com.masood;

import com.masood.modules.m_5.configuration.ProjectConfiguration;
import com.masood.modules.m_5.entities.Comment;
import com.masood.modules.m_5.services.CommentService;
import com.masood.modules.m_5.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        var c  = new AnnotationConfigApplicationContext(ProjectConfiguration.class);


        var b1 = c.getBean("commentService", CommentService.class);
        var b2 = c.getBean("userService", UserService.class);

        Comment cm = new Comment();
        cm.setAuthor("Masood");
        cm.setText("Crime et Chatiment");
        b1.sendComment(cm);

    }
}







