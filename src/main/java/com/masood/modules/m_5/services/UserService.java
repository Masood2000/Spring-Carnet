package com.masood.modules.m_5.services;
import com.masood.modules.m_5.entities.Comment;
import com.masood.modules.m_5.proxies.CommentNotificationProxy;
import com.masood.modules.m_5.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/***
 * It's a services class and  we don't
 * need to create interface for them so annotating
 * directly with the @Service
 */

@Service
@Qualifier("userService")
public class UserService {


    private final CommentRepository mCommentRepository;

    @Autowired
    public UserService(CommentRepository commentRepository) {
        this.mCommentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return this.mCommentRepository;
    }
}

