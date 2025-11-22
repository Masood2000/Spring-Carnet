package com.masood;

import com.masood.modules.m_4_1.Comment;
import com.masood.modules.m_4_1.DbCommentRepository;
import com.masood.modules.m_4_1.EmailCommentNotificationProxy;
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