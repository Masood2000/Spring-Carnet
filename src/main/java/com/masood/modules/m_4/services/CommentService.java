package com.masood.modules.m_4.services;
import com.masood.modules.m_4.entities.Comment;
import com.masood.modules.m_4.proxies.CommentNotificationProxy;
import com.masood.modules.m_4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/***
 * It's a services class and  we don't
 * need to create interface for them so annotating
 * directly with the @Service
 */

@Service
public class CommentService {

    private final CommentRepository mCommentRepository;
    private final CommentNotificationProxy mCommentNotificationProxy;


    @Autowired
    public CommentService(CommentRepository commentRepository,@Qualifier("email_notification_proxy") CommentNotificationProxy commentNotificationProxy) {
        this.mCommentRepository = commentRepository;
        this.mCommentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        this.mCommentRepository.storeComment(comment);
        this.mCommentNotificationProxy.sendComment(comment);
    }


}



