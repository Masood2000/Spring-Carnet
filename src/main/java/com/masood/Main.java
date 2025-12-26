package com.masood;


import com.masood.modules.m_5.configuration.ProjectConfiguration;
import com.masood.modules.m_5.services.CommentService;
import com.masood.modules.m_5.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        var c  = new AnnotationConfigApplicationContext(ProjectConfiguration.class);


        var b1 = c.getBean("commentService", CommentService.class).getCommentRepository();
        var b2 = c.getBean("userService", UserService.class).getCommentRepository();

        var ans = b1==b2;

        System.out.println(ans);

    }
}





