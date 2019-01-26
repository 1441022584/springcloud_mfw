package com.jk.model;

import java.io.Serializable;

public class IndentBean implements Serializable {

    private Integer id;         // 主键

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}