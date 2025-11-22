package com.masood.modules.m_4_1.configuration;


import com.masood.modules.m_4_1.proxies.CommentNotificationProxy;
import com.masood.modules.m_4_1.proxies_impl.EmailCommentNotificationProxy;
import com.masood.modules.m_4_1.repositories.CommentRepository;
import com.masood.modules.m_4_1.repositories_impl.DbCommentRepository;
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


}
