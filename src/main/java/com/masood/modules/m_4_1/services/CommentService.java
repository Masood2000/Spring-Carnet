package com.masood.modules.m_4_1.services;


import com.masood.modules.m_4_1.Comment;
import com.masood.modules.m_4_1.proxies.CommentNotificationProxy;
import com.masood.modules.m_4_1.repositories.CommentRepository;

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