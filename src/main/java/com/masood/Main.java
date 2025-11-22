package com.masood;

import com.masood.modules.m_4_1.entities.Comment;
import com.masood.modules.m_4_1.repositories_impl.DbCommentRepository;
import com.masood.modules.m_4_1.proxies_impl.EmailCommentNotificationProxy;
import com.masood.modules.m_4_1.services.CommentService;

public class Main {
    public static void main(String[] args) {


        var commentRepository = new DbCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository,commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Masood");
        comment.setText("This is my first Comment");

        commentService.publishComment(comment);

    }
}