package com.masood.modules.m_6.services;
import com.masood.modules.m_5.entities.Comment;
import com.masood.modules.m_5.proxies.CommentNotificationProxy;
import com.masood.modules.m_5.repositories.CommentRepository;
import com.masood.modules.m_5.utils.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


/***
 * It's a services class and we don't
 * need to create interface for them so annotating
 * directly with the @Service
 */

@Service
@Qualifier("commentService")
//it's a prototype bean, every time a new bean is created by the context
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CommentService {

    @Autowired
    private ApplicationContext context;

    private final CommentRepository mCommentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.mCommentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return this.mCommentRepository;
    }


    public void sendComment(Comment _comment) {

        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);

        commentProcessor.setComment(_comment);
        commentProcessor.processComment();
        commentProcessor.validateComment();

        _comment = commentProcessor.getComment();

        commentProcessor.sendComment();

    }

}




