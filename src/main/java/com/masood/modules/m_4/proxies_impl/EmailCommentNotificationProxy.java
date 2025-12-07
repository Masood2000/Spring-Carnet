package com.masood.modules.m_4.proxies_impl;


import com.masood.modules.m_4.entities.Comment;
import com.masood.modules.m_4.proxies.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@Qualifier("email_notification_proxy")
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Comment by Email -> " + comment.getText());
    }



}



