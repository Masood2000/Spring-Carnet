package com.masood.modules.m_5.repositories_impl;

import com.masood.modules.m_5.entities.Comment;
import com.masood.modules.m_5.repositories.CommentRepository;
import org.springframework.stereotype.Repository;


@Repository
public class DbCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment in the DB ->"+comment.getText());
    }

}
