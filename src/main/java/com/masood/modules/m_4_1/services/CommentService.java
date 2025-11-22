package com.masood.modules.m_4_1.services;


import com.masood.modules.m_4_1.proxies.CommentNotificationProxy;
import com.masood.modules.m_4_1.repositories.CommentRepository;

class CommentService {

    private final CommentRepository mCommentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    CommentService(CommentRepository mCommentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.mCommentRepository = mCommentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
}