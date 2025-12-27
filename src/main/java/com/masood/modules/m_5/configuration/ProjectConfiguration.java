package com.masood.modules.m_5.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.masood.modules.m_5.proxies_impl",
        "com.masood.modules.m_5.services",
        "com.masood.modules.m_5.repositories_impl",
        "com.masood.modules.m_5.utils"
})
public class ProjectConfiguration {


/***
 * Below is the way to add beans using the
 * methods way and we can also do this by using stereotype annotations.
 */




/*    @Bean
    public CommentRepository commentRepository() {
        return new DbCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy
    ) {
        return new CommentService(
                commentRepository,
                commentNotificationProxy
        );
    }*/

}



