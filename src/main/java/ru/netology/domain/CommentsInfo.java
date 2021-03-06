package ru.netology.domain;

public class CommentsInfo {

    int count;//колличество комментариев
    boolean canPost;//информация: может ли пользователь комментировать запись
    boolean groupsCanPost;//иноформауия: могут ли сообщества комментировать запись

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}
    public boolean isCanPost() {return canPost;}
    public void setCanPost(boolean canPost) {this.canPost = canPost;}
    public boolean isGroupCanPost() {return groupsCanPost;}
    public void setGroupsCanPost(boolean groupsCanPost) {this.groupsCanPost = groupsCanPost;}

}
