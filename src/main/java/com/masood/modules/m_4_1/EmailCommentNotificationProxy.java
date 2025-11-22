package com.masood.modules.m_4_1;


import com.masood.modules.m_4_1.proxies.CommentNotificationProxy;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Comment by Email -> " + comment.getText());
    }

}
