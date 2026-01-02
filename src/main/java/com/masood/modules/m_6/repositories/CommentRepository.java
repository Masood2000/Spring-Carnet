package com.masood.modules.m_6.repositories;

import com.masood.modules.m_6.entities.Comment;


/***
 * No need to annotate interfaces in spring only
 * the classes which implements them must be annotated
 * with the @Component
 * because there is no need to annotate the interfaces
 * because there object is not created.
 */
public interface CommentRepository {

    public void  storeComment(Comment comment);

}