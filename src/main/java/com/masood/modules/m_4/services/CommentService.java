package com.masood.modules.m_4.services;


import com.masood.modules.m_4.entities.Comment;
import com.masood.modules.m_4.proxies.CommentNotificationProxy;
import com.masood.modules.m_4.repositories.CommentRepository;
import org.springframework.stereotype.Component;


@Component
public class CommentService {

    private final CommentRepository mCommentRepository;
    private final CommentNotificationProxy mCommentNotificationProxy;


    public CommentService(CommentRepository mCommentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.mCommentRepository = mCommentRepository;
        this.mCommentNotificationProxy = commentNotificationProxy;
    }


    public void publishComment(Comment comment) {
        this.mCommentRepository.storeComment(comment);
        this.mCommentNotificationProxy.sendComment(comment);
    }

}