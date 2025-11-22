package com.masood.modules.m_4.configuration;


import com.masood.modules.m_4.proxies.CommentNotificationProxy;
import com.masood.modules.m_4.proxies_impl.EmailCommentNotificationProxy;
import com.masood.modules.m_4.repositories.CommentRepository;
import com.masood.modules.m_4.repositories_impl.DbCommentRepository;
import com.masood.modules.m_4.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
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

}
