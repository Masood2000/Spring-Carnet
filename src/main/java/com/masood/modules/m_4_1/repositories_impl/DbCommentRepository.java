package com.masood.modules.m_4_1.repositories_impl;

import com.masood.modules.m_4_1.entities.Comment;
import com.masood.modules.m_4_1.repositories.CommentRepository;
import org.springframework.stereotype.Component;


@Component
public class DbCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment in the DB ->"+comment.getText());
    }

}
