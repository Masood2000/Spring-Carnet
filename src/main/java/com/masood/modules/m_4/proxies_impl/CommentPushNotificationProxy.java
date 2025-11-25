package com.masood.modules.m_4.proxies_impl;

import com.masood.modules.m_4.entities.Comment;
import com.masood.modules.m_4.proxies.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;





@Component
@Qualifier("push_notification_proxy")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {

        System.out.println("Sending Comment via PUSH Notification -> "+comment.getText());

    }
}
