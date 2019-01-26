package com.jk.model;

import java.io.Serializable;

public class WendaBean implements Serializable {

    private Integer id;   //主键

    private String quiz; // 我的提问

    private String answer; //我的回答

    private Integer attention; //关注问题

    private Integer collect; //收藏回答

    private String drafts; //草稿箱

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz == null ? null : quiz.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public String getDrafts() {
        return drafts;
    }

    public void setDrafts(String drafts) {
        this.drafts = drafts == null ? null : drafts.trim();
    }
}