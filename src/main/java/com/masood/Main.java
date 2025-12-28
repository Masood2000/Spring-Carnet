package com.masood;


import com.masood.modules.m_6.configuration.ProjectConfiguration;
import com.masood.modules.m_6.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        var c  = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        
        var b1 = c.getBean("commentService", CommentService.class);


        System.out.println(b1.getClass());

    }
}









