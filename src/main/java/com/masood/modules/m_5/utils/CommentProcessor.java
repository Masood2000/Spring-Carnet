package com.masood.modules.m_5.utils;

import com.masood.modules.m_5.entities.Comment;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment() {
        System.out.println("Processing the Comment");
    }

    public void validateComment() {
        System.out.println("Validating the Comment");
    }
}