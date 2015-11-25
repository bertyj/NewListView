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
public class OneLineCardItem extends CardListItem {
    private ImageView mImageView;
    private String mFirstString;
    private String mSecondString;

    public OneLineCardItem() {}

    public ImageView getImageView() {
        return mImageView;
    }

    public void setImageView(ImageView mImageView) {
        this.mImageView = mImageView;
    }

    public String getFirstString() {
        return mFirstString;
    }

    public void setFirstString(String mFirstString) {
        this.mFirstString = mFirstString;
    }

    public String getSecondString() {
        return mSecondString;
    }

    public void setSecondString(String mSecondString) {
        this.mSecondString = mSecondString;
    }
}
