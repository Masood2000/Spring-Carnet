package com.masood;


import com.masood.modules.m_6.configuration.ProjectConfiguration;
import com.masood.modules.m_6.entities.Comment;
import com.masood.modules.m_6.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        var c  = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = c.getBean(CommentService.class);


        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        String ans1= service.publishComment(comment);
        String ans2= service.editComment();
        String ans3= service.deleteComment();




        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

    }
}

