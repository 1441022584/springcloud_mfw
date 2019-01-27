package com.jk.model;

import java.io.Serializable;

public class HotelComment implements Serializable {

    private Integer  pl_comment_id ;//评论ID
    private Integer  user_id ;//旅客ID
    private String pl_content ;//评论内容
    private String pl_time ;//评论时间
    private String pl_img ;//评论图片
    private Integer pl_place ;//位置评分
    private Integer pl_serve ;//服务评分
    private Integer pl_cleanliness ;//清洁评分
    private Integer pl_comfort ;//舒适评分
    private Integer pl_facility ;//设施评分
    private Integer pl_repast ;//餐饮评分
    private Integer pl_reply ;//评论回复
    private Integer pl_synthesize_grade ;//综合评分

    public Integer getPl_comment_id() {
        return pl_comment_id;
    }

    public void setPl_comment_id(Integer pl_comment_id) {
        this.pl_comment_id = pl_comment_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPl_content() {
        return pl_content;
    }

    public void setPl_content(String pl_content) {
        this.pl_content = pl_content;
    }

    public String getPl_time() {
        return pl_time;
    }

    public void setPl_time(String pl_time) {
        this.pl_time = pl_time;
    }

    public String getPl_img() {
        return pl_img;
    }

    public void setPl_img(String pl_img) {
        this.pl_img = pl_img;
    }

    public Integer getPl_place() {
        return pl_place;
    }

    public void setPl_place(Integer pl_place) {
        this.pl_place = pl_place;
    }

    public Integer getPl_serve() {
        return pl_serve;
    }

    public void setPl_serve(Integer pl_serve) {
        this.pl_serve = pl_serve;
    }

    public Integer getPl_cleanliness() {
        return pl_cleanliness;
    }

    public void setPl_cleanliness(Integer pl_cleanliness) {
        this.pl_cleanliness = pl_cleanliness;
    }

    public Integer getPl_comfort() {
        return pl_comfort;
    }

    public void setPl_comfort(Integer pl_comfort) {
        this.pl_comfort = pl_comfort;
    }

    public Integer getPl_facility() {
        return pl_facility;
    }

    public void setPl_facility(Integer pl_facility) {
        this.pl_facility = pl_facility;
    }

    public Integer getPl_repast() {
        return pl_repast;
    }

    public void setPl_repast(Integer pl_repast) {
        this.pl_repast = pl_repast;
    }

    public Integer getPl_reply() {
        return pl_reply;
    }

    public void setPl_reply(Integer pl_reply) {
        this.pl_reply = pl_reply;
    }

    public Integer getPl_synthesize_grade() {
        return pl_synthesize_grade;
    }

    public void setPl_synthesize_grade(Integer pl_synthesize_grade) {
        this.pl_synthesize_grade = pl_synthesize_grade;
    }
}
