package ru.netology.domain;

public class LikeInfo {
    int count;//число пользователей, которым понравилась запись
    boolean usersLikes;//наличие отметки «Мне нравится» от текущего пользователя
    boolean canLike;//может ли пользователь поставить лайк
    boolean canPublish;//может ли пользователь сделать репост

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}

    public boolean isUsersLikes() {return usersLikes;}
    public void setUsersLikes(boolean usersLikes) {this.usersLikes = usersLikes;}

    public boolean isCanLike() {return canLike;}
    public void setCanLike(boolean canLike) {this.canLike = canLike;}

    public boolean isCanPublish() {return canPublish;}
    public void setCanPublish(boolean canPublish) {this.canPublish = canPublish;}




}
