package com.masood.modules.m_5.services;
import com.masood.modules.m_5.entities.Comment;
import com.masood.modules.m_5.proxies.CommentNotificationProxy;
import com.masood.modules.m_5.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


/***
 * It's a services class and  we don't
 * need to create interface for them so annotating
 * directly with the @Service
 */

@Service
@Qualifier("commentService")
@Lazy
public class CommentService {


    private final CommentRepository mCommentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.mCommentRepository = commentRepository;
        System.out.println("Comment Service Instance Created");
    }

    public CommentRepository getCommentRepository() {
        return this.mCommentRepository;
    }



}




