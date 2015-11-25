/*
 * Copyright (C) 2015-2016 BMW GROUP.
 * All rights reserved.
 * 
 * Project    : ConnectedRide: NewListView
 * Department : EC-17
 */

package com.example.newlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewListAdapter extends android.widget.BaseAdapter {

    public static final int ONELINE_LAYOUT_TYPE = 0;
    public static final int TWOLINE_LAYOUT_TYPE = 1;
    public static final int OTHER_LAYOUT_TYPE = 2;
    private final List<CardListItem> mList;
    private final LayoutInflater mInflater;

    public NewListAdapter(Context context, List<CardListItem> myList) {
        this.mList = myList;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public int getItemViewType(int position) {

        CardListItem mCardListItem = mList.get(position);
        int type = mCardListItem.getType();
        return type;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        // CardListItem cItem = mList.get(position);
        int type = getItemViewType(position);
        OneLineViewHolder oneLineViewHolder = null;
        TwoLineViewHolder twoLineViewHolder = null;
        OtherViewHolder otherViewHolder = null;
        if (convertView == null) {
            switch (type) {
                case ONELINE_LAYOUT_TYPE:
                    oneLineViewHolder = new OneLineViewHolder();
                    convertView = mInflater.inflate(R.layout.oneline_layout_item, null);
                    oneLineViewHolder.mImageView = (ImageView) convertView.findViewById(R.id.basic_card_image);
                    oneLineViewHolder.mTextView1 = (TextView) convertView.findViewById(R.id.baisc_card_first_text);
                    oneLineViewHolder.mTextView2 = (TextView) convertView.findViewById(R.id.basic_card_second_text);
                    convertView.setTag(oneLineViewHolder);
                    break;
                case TWOLINE_LAYOUT_TYPE:
                    twoLineViewHolder = new TwoLineViewHolder();
                    convertView = mInflater.inflate(R.layout.twoline_layout_item, null);
                    View firstView = convertView.findViewById(R.id.twoline_first_layout);
                    View secondView = convertView.findViewById(R.id.twoline_second_layout);
                    twoLineViewHolder.mLayout1ImageView = (ImageView) firstView.findViewById(R.id.basic_card_image);
                    twoLineViewHolder.mLayout1TextView1 = (TextView) firstView.findViewById(R.id.baisc_card_first_text);
                    twoLineViewHolder.mLayout1TextView2 = (TextView) firstView.findViewById(R.id.basic_card_second_text);
                    twoLineViewHolder.mLayout2ImageView = (ImageView) secondView.findViewById(R.id.basic_card_image);
                    twoLineViewHolder.mLayout2TextView1 = (TextView) secondView.findViewById(R.id.baisc_card_first_text);
                    twoLineViewHolder.mLayout2TextView2 = (TextView) secondView.findViewById(R.id.basic_card_second_text);
                    convertView.setTag(twoLineViewHolder);
                    break;
                case OTHER_LAYOUT_TYPE:
                    break;
            }
        } else {
            switch (type) {
                case ONELINE_LAYOUT_TYPE:
                    oneLineViewHolder = (OneLineViewHolder) convertView.getTag();
                    break;
                case TWOLINE_LAYOUT_TYPE:
                    twoLineViewHolder = (TwoLineViewHolder) convertView.getTag();
                    break;
                case OTHER_LAYOUT_TYPE:
                    break;
            }
        }
        switch (type) {
            case ONELINE_LAYOUT_TYPE:
                OneLineCardItem cItem = (OneLineCardItem) mList.get(position);
                oneLineViewHolder.mImageView = cItem.getImageView();
                oneLineViewHolder.mTextView1.setText(cItem.getFirstString());
                oneLineViewHolder.mTextView1.setTextSize(20);
                oneLineViewHolder.mTextView2.setText(cItem.getSecondString());
                oneLineViewHolder.mTextView2.setTextSize(40);
                break;
            case TWOLINE_LAYOUT_TYPE:
                TwoLineCardItem tItem = (TwoLineCardItem) mList.get(position);
                twoLineViewHolder.mLayout1ImageView = tItem.get1stLayoutImageView();
                twoLineViewHolder.mLayout2ImageView = tItem.get2ndLayoutImageView();
                twoLineViewHolder.mLayout1TextView1.setText(tItem.get1stLayout1stString());
                twoLineViewHolder.mLayout1TextView1.setTextSize(10);
                twoLineViewHolder.mLayout1TextView2.setText(tItem.get1stLayout2ndString());
                twoLineViewHolder.mLayout1TextView2.setTextSize(20);
                twoLineViewHolder.mLayout2TextView1.setText(tItem.get2ndLayout1stString());
                twoLineViewHolder.mLayout2TextView1.setTextSize(10);
                twoLineViewHolder.mLayout2TextView2.setText(tItem.get2ndLayout2ndString());
                twoLineViewHolder.mLayout2TextView2.setTextSize(20);
                break;
            case OTHER_LAYOUT_TYPE:
                break;
        }
        return convertView;
    }

    class OneLineViewHolder {
        private ImageView mImageView;
        private TextView mTextView1;
        private TextView mTextView2;
    }

    class TwoLineViewHolder {
        private ImageView mLayout1ImageView;
        private TextView mLayout1TextView1;
        private TextView mLayout1TextView2;

        private ImageView mLayout2ImageView;
        private TextView mLayout2TextView1;
        private TextView mLayout2TextView2;
    }

    class OtherViewHolder {}

}
