package com.kuliah.wikisejarah;

public class Sejarah {
    private String name;
    private String detail;
    private String[] tokoh;
    private String[] tokohDdetail;
    private int photo;

    public String[] getTokoh() {
        return tokoh;
    }

    public void setTokoh(String[] tokoh) {
        this.tokoh = tokoh;
    }

    public String[] getTokohDdetail() {
        return tokohDdetail;
    }

    public void setTokohDdetail(String[] tokohDdetail) {
        this.tokohDdetail = tokohDdetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
