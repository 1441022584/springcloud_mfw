package com.jk.model;

import java.io.Serializable;

public class HotelReply implements Serializable {

    private Integer    reply_id ;//回复ID
    private Integer    user_id ;//旅客ID
    private String    reply_content ;//回复内容
    private String    reply_time;// 回复时间
    private Integer    pl_comment_id ;//评论ID

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }

    public String getReply_time() {
        return reply_time;
    }

    public void setReply_time(String reply_time) {
        this.reply_time = reply_time;
    }

    public Integer getPl_comment_id() {
        return pl_comment_id;
    }

    public void setPl_comment_id(Integer pl_comment_id) {
        this.pl_comment_id = pl_comment_id;
    }
}
