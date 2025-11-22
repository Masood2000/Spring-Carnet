package com.masood.modules.m_4_1;

import com.masood.modules.m_4_1.repositories.CommentRepository;

public class DbCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment in the DB ->"+comment);
    }

}
