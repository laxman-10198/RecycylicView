package com.example.recycylicview;

import android.graphics.drawable.Drawable;

public class MyListData {

    private String description;

    private Drawable imgId;

    public MyListData(String description, Drawable imgId) {
        this.description = description;
        this.imgId = imgId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getImgId() {
        return imgId;
    }

    public void setImgId(Drawable imgId) {
        this.imgId = imgId;
    }
}