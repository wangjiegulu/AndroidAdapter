package com.wangjie.androidadapter.sample.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.wangjie.androidadapter.sample.R;
import com.wangjie.androidadapter.sample.Util;
import com.wangjie.androidadapter.core.AdapterTypeRender;
import com.wangjie.androidadapter.sample.model.Person;

/**
 * Created by wangjie on 11/18/15.
 */
public class TypeBRender implements AdapterTypeRender<View> {
    private LvtAdapter adapter;
    private View view;

    public TypeBRender(Context context, LvtAdapter adapter) {
        this.adapter = adapter;
        view = LayoutInflater.from(context).inflate(R.layout.type_b, null);
    }

    @Override
    public View getReusableComponent() {
        return view;
    }

    @Override
    public void bindEvents() {

    }

    @Override
    public void bindData(int position) {
        Person p = adapter.getItem(position);
        TextView nameTv = Util.obtainView(view, R.id.type_b_name);
        nameTv.setText(p.getName());

        TextView ageTv = Util.obtainView(view, R.id.type_b_age);
        ageTv.setText(String.valueOf(p.getAge()));
    }
}
