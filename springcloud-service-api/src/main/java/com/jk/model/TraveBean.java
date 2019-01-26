package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class TraveBean implements Serializable {

    private Integer id;   // 主键

    private String headline;   // 游记标题

    private String content;   // 游记内容

    private String paragraph;   //  段落标题

    private String traveImg;   //  游记图片

    private String datatime;   //  发表时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline == null ? null : headline.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph == null ? null : paragraph.trim();
    }

    public String getTraveImg() {
        return traveImg;
    }

    public void setTraveImg(String traveImg) {
        this.traveImg = traveImg == null ? null : traveImg.trim();
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }
}