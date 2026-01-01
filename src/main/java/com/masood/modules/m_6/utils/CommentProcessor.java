package com.masood.modules.m_6.utils;

import com.masood.modules.m_6.repositories.CommentRepository;
import com.masood.modules.m_6.entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment mComment;

    @Autowired
    private CommentRepository commentRepository;


    public void setComment(Comment _comment) {
        this.mComment = _comment;
    }

    public Comment getComment() {
        return this.mComment;
    }

    public void processComment() {
        System.out.println("Processing the Comment");
    }

    public void validateComment() {
        System.out.println("Validating the Comment");
    }

    public void sendComment() {
        commentRepository.storeComment(this.mComment);
        System.out.println(this.mComment.toString()+"-> sent");
    }

}

