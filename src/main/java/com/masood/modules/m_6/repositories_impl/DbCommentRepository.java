package com.masood.modules.m_6.repositories_impl;

import com.masood.modules.m_6.entities.Comment;
import com.masood.modules.m_6.repositories.CommentRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;


@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DbCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment in the DB ->"+comment.getText());
    }

}



