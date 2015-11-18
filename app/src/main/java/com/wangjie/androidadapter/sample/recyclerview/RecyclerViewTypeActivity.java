package com.wangjie.androidadapter.sample.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.wangjie.androidadapter.sample.R;
import com.wangjie.androidadapter.sample.recyclerview.adapter.RvtAdapter;

/**
 * Created by wangjie on 11/18/15.
 */
public class RecyclerViewTypeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_type);

        RecyclerView rv = (RecyclerView) findViewById(R.id.activity_recyclerview_type_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(new RvtAdapter(this));

    }
}
