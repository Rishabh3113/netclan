package com.example.netclan;

import android.widget.ImageView;

public class model2 {

    String name,location,mode,desc;

    int imageView;

    public model2(String name, String location, String mode, String desc, int imageView) {
        this.name = name;
        this.location = location;
        this.mode = mode;
        this.desc = desc;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
