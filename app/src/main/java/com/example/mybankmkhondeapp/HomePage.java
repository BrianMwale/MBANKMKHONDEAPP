package com.example.mybankmkhondeapp;

public class HomePage {
    private String item_name;
    private int imgid;

    public HomePage(String course_name, int imgid) {
        this.item_name = course_name;
        this.imgid = imgid;
    }

    public String getItemName() {
        return item_name;
    }

    public void setItemName(String course_name) {
        this.item_name = course_name;
    }

    public int getItem() {
        return imgid;
    }

    public void setItem(int imgid) {
        this.imgid = imgid;
    }
}
