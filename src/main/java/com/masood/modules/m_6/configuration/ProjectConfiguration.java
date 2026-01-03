package com.masood.modules.m_6.configuration;

import com.masood.modules.m_6.aspects.LoggingAspect;
import com.masood.modules.m_6.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {
        "com.masood.modules.m_6.proxies_impl",
        "com.masood.modules.m_6.services",
        "com.masood.modules.m_6.repositories_impl",
        "com.masood.modules.m_6.utils",
        "com.masood.modules.m_6.aspects"
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
    }


    @Bean
    public LoggingAspect getLoggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect getSecurityAscpect() {
        return new SecurityAspect();
    }
*/




}





