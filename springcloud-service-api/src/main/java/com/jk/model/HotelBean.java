package com.jk.model;

import java.io.Serializable;

public class HotelBean implements Serializable {

    private Integer hotel_id ;//酒店ID
    private Integer scenic_spot_id ;//所属景点
    private String hotel_checkin_time ;//入住时间
    private String hotel_checkout_time;// 退房时间
    private Integer hotel_adult_count ;//成年人数
    private Integer hotel_child_count;// 儿童人数   （默认0）
    private Integer hotel_theme ;//酒店主题         （网红酒店，周末好去处，亲子之选，朝拜历史，私人海滩，童话小镇）
    private Integer hotel_comment_id ;//酒店评论
    private Integer hotel_price ;//每晚价格
    private String hotel_img ;//酒店图片

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getScenic_spot_id() {
        return scenic_spot_id;
    }

    public void setScenic_spot_id(Integer scenic_spot_id) {
        this.scenic_spot_id = scenic_spot_id;
    }

    public String getHotel_checkin_time() {
        return hotel_checkin_time;
    }

    public void setHotel_checkin_time(String hotel_checkin_time) {
        this.hotel_checkin_time = hotel_checkin_time;
    }

    public String getHotel_checkout_time() {
        return hotel_checkout_time;
    }

    public void setHotel_checkout_time(String hotel_checkout_time) {
        this.hotel_checkout_time = hotel_checkout_time;
    }

    public Integer getHotel_adult_count() {
        return hotel_adult_count;
    }

    public void setHotel_adult_count(Integer hotel_adult_count) {
        this.hotel_adult_count = hotel_adult_count;
    }

    public Integer getHotel_child_count() {
        return hotel_child_count;
    }

    public void setHotel_child_count(Integer hotel_child_count) {
        this.hotel_child_count = hotel_child_count;
    }

    public Integer getHotel_theme() {
        return hotel_theme;
    }

    public void setHotel_theme(Integer hotel_theme) {
        this.hotel_theme = hotel_theme;
    }

    public Integer getHotel_comment_id() {
        return hotel_comment_id;
    }

    public void setHotel_comment_id(Integer hotel_comment_id) {
        this.hotel_comment_id = hotel_comment_id;
    }

    public Integer getHotel_price() {
        return hotel_price;
    }

    public void setHotel_price(Integer hotel_price) {
        this.hotel_price = hotel_price;
    }

    public String getHotel_img() {
        return hotel_img;
    }

    public void setHotel_img(String hotel_img) {
        this.hotel_img = hotel_img;
    }
}
