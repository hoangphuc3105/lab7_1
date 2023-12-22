package com.example.lab7_1;

public class ToDo {
    private Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public ToDo(Integer id, String title, String content, String date, String type, Integer status) {
        Id = id;
        Title = title;
        Content = content;
        Date = date;
        Type = type;
        Status = status;
    }

    private String Title;
    private String Content;
    private String Date;
    private String Type;
    private Integer Status;
}
