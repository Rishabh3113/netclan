package com.example.netclan;

import android.widget.ImageView;

public class model {
    String head;
    String lower;
    int profile;
    int arrow;

    public model(String head, String lower, int profile, int arrow) {
        this.head = head;
        this.lower = lower;
        this.profile = profile;
        this.arrow = arrow;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getLower() {
        return lower;
    }

    public void setLower(String lower) {
        this.lower = lower;
    }

    public int getProfile() {
        return profile;
    }

    public int getArrow() {
        return arrow;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }


}
