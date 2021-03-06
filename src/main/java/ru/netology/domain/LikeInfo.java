package ru.netology.domain;

public class LikeInfo {
    int count;//число пользователей, которым понравилась запись
    boolean usersLikes;//наличие отметки «Мне нравится» от текущего пользователя

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}

    public boolean isUsersLikes() {return usersLikes;}
    public void setUsersLikes(boolean usersLikes) {this.usersLikes = usersLikes;}

}
