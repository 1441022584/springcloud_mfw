package com.jk.model;

import java.io.Serializable;

public class UserBean implements Serializable {

    private Integer id;     //主键id

    private String name;    //用户名称

    private String userImg;  //头像

    private Integer sex;   //性别  (1 男 , 2女)

    private String userSignature;   //签名

    private Integer userFans;   //我的粉丝

    private String userCity;  //所在地区

    private Integer wendaId; // 我的问答                   关联表   t_user_wenda

    private Integer traveId;   // 我的游记                   关联表   t_user_trave       // 准备去哪

    private Integer remarkId;   //我的点评                    关联表    t_user_remark

    private Integer collectId; //我的收藏     // 关联地区表 用户表

    private Integer indentId;  //我的订单                    关联表   t_user_Indent

    private Integer footprintId;   //我的足迹                  关联表  t_user_footprint      // 去过哪

    private Integer userAttention;   //我的关注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public Integer getUserFans() {
        return userFans;
    }

    public void setUserFans(Integer userFans) {
        this.userFans = userFans;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public Integer getWendaId() {
        return wendaId;
    }

    public void setWendaId(Integer wendaId) {
        this.wendaId = wendaId;
    }

    public Integer getTraveId() {
        return traveId;
    }

    public void setTraveId(Integer traveId) {
        this.traveId = traveId;
    }

    public Integer getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(Integer remarkId) {
        this.remarkId = remarkId;
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getIndentId() {
        return indentId;
    }

    public void setIndentId(Integer indentId) {
        this.indentId = indentId;
    }

    public Integer getFootprintId() {
        return footprintId;
    }

    public void setFootprintId(Integer footprintId) {
        this.footprintId = footprintId;
    }

    public Integer getUserAttention() {
        return userAttention;
    }

    public void setUserAttention(Integer userAttention) {
        this.userAttention = userAttention;
    }
}