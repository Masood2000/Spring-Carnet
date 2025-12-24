package com.masood.modules.m_5.proxies;

import com.masood.modules.m_5.entities.Comment;


/***
 * No need to annotate interfaces in spring only
 * the classes which implements them must be annotated
 * with the @Component
 * because there is no need to annotate the interfaces
 * because there object is not created.
 */
public interface CommentNotificationProxy {

    public void sendComment(Comment comment);

}

