package ru.netology.domain;

public class Post {

    int userId;//создатель поста
    int postId;//пост
    int date;//дата создания поста
    int replyPostId;//ответ на пост
    boolean canPin;//закрепление поста
    boolean canDelete;//удаление поста
    boolean canEdit;//редактироват пост
    LikeInfo likeinfo;//колличество лайков
    ViewInfo viewInfo;//колличетсво просмотровв
    CommentsInfo commentsinfo;//колличетсво комментариев

    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public int getPostId() {return postId;}
    public void setPostId(int postId) {this.postId = postId;}
    public int getDate() {return date;}
    public void setDate(int date) {this.date = date;}
    public int getReplyPostId () {return replyPostId;}
    public void setReplyPostId (int replyPostId) {this.replyPostId = replyPostId;}

    public boolean isCanPin() {return canPin;}
    public void setCanPin(boolean canPin) {this.canPin = canPin;}

    public boolean canDelete () {return canDelete;}
    public void setCanDelete(boolean canDelete) {this.canDelete = canDelete;}

    public boolean canEdit() {return canEdit;}
    public void setCanEdit(boolean canEdit) {this.canEdit = canEdit;}


    public LikeInfo getLikesInfo() {return likeinfo;}
    public void setLikeInfo (LikeInfo likeinfo) {this.likeinfo = likeinfo;}

    public ViewInfo getViewInfo () {return viewInfo;}
    public void setViewInfo(ViewInfo viewinfo) {this.viewInfo = viewinfo;}

    public CommentsInfo getCommentsInfo () {return commentsinfo;}
    public void setCommentInfo (CommentsInfo commentsInfo) {this.commentsinfo = commentsInfo;}








}
