/*
 * Copyright (C) 2015-2016 BMW GROUP.
 * All rights reserved.
 * 
 * Project    : ConnectedRide: NewListView
 * Department : EC-17
 */

package com.example.newlistview;

import android.widget.ImageView;

/**
 * @author Pactera
 */
public class TwoLineCardItem extends CardListItem {
    private ImageView m1stLayoutImageView;
    private ImageView m2ndLayoutImageView;
    private String m1stLayout1stString;
    private String m1stLayout2ndString;
    private String m2ndLayout1stString;
    private String m2ndLayout2ndString;

    public TwoLineCardItem() {}

    public ImageView get1stLayoutImageView() {
        return m1stLayoutImageView;
    }

    public void set1stLayoutImageView(ImageView m1stLayoutImageView) {
        this.m1stLayoutImageView = m1stLayoutImageView;
    }

    public ImageView get2ndLayoutImageView() {
        return m2ndLayoutImageView;
    }

    public void set2ndLayoutImageView(ImageView m2ndLayoutImageView) {
        this.m2ndLayoutImageView = m2ndLayoutImageView;
    }

    public String get1stLayout1stString() {
        return m1stLayout1stString;
    }

    public void set1stLayout1stString(String m1stLayout1stString) {
        this.m1stLayout1stString = m1stLayout1stString;
    }

    public String get1stLayout2ndString() {
        return m1stLayout2ndString;
    }

    public void set1stLayout2ndString(String m1stLayout2ndString) {
        this.m1stLayout2ndString = m1stLayout2ndString;
    }

    public String get2ndLayout1stString() {
        return m2ndLayout1stString;
    }

    public void set2ndLayout1stString(String m2ndLayout1stString) {
        this.m2ndLayout1stString = m2ndLayout1stString;
    }

    public String get2ndLayout2ndString() {
        return m2ndLayout2ndString;
    }

    public void set2ndLayout2ndString(String m2ndLayout2ndString) {
        this.m2ndLayout2ndString = m2ndLayout2ndString;
    }

}
