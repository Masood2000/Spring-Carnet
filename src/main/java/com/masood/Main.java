package com.masood;


import com.masood.modules.m_5.configuration.ProjectConfiguration;
import com.masood.modules.m_5.services.CommentService;
import com.masood.modules.m_5.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        var c  = new AnnotationConfigApplicationContext(ProjectConfiguration.class);


        System.out.println("this line is executed");

        Thread.sleep(2000L);

        var k = c.getBean("commentService", CommentService.class);


    }
}





