
package com.example.newlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listview_data);
        mListView.setAdapter(getAdapter());
    }

    private BaseAdapter getAdapter() {
        return new NewListAdapter(this, getData());
    }

    private List<CardListItem> getData() {
        List<CardListItem> cardList = new ArrayList<CardListItem>();

        OneLineCardItem olci = new OneLineCardItem();
        olci.setType(NewListAdapter.ONELINE_LAYOUT_TYPE);
        olci.setImageView((ImageView) findViewById(R.drawable.firstpic));
        olci.setFirstString("Do not have one yet?");
        olci.setSecondString("Get one now!");
        cardList.add(olci);

        TwoLineCardItem tlci = new TwoLineCardItem();
        tlci.setType(NewListAdapter.TWOLINE_LAYOUT_TYPE);
        tlci.set1stLayoutImageView((ImageView) findViewById(R.drawable.firstpic));
        tlci.set2ndLayoutImageView((ImageView) findViewById(R.drawable.firstpic));
        tlci.set1stLayout1stString("Location:");
        tlci.set1stLayout2ndString("133 Wuding road");
        tlci.set2ndLayout1stString("Estimated time:");
        tlci.set2ndLayout2ndString("17 min");
        cardList.add(tlci);

        return cardList;
    }
}
