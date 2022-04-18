package com.insungHome.springbootPrac.dto;

public class Articleform {

    private String title;
    private String content;

    public Articleform(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Articleform{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
