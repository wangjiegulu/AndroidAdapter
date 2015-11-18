package com.wangjie.androidadapter.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        String tag = (String) view.getTag();
        if (null == tag) {
            return;
        }
        try {
            startActivity(new Intent(this, Class.forName(tag)));
        } catch (ClassNotFoundException e) {
            Toast.makeText(this, "Class not found with tag[" + tag + "]", Toast.LENGTH_SHORT).show();
        }

    }

}
