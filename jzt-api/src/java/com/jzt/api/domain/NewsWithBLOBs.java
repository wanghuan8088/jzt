package com.jzt.api.domain;

public class NewsWithBLOBs extends News {
    private String abstracts;

    private String content;

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}