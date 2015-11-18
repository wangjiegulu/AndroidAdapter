package com.wangjie.androidadapter.sample.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.wangjie.androidadapter.sample.R;
import com.wangjie.androidadapter.sample.listview.adapter.LvtAdapter;

/**
 * Created by wangjie on 11/18/15.
 */
public class ListViewTypeActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_type);
        lv = (ListView) findViewById(R.id.activity_listview_type_lv);

        lv.setAdapter(new LvtAdapter(this));

    }


}
