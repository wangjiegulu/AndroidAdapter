package com.wangjie.androidadapter.sample.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wangjie.androidadapter.core.AdapterTypeRender;
import com.wangjie.androidadapter.sample.R;
import com.wangjie.androidadapter.sample.model.Person;
import com.wangjie.androidadapter.view.recyclerview.ARecyclerViewHolder;

/**
 * Created by wangjie on 11/18/15.
 */
public class TypeARvRender implements AdapterTypeRender<ARecyclerViewHolder> {
    private RvtAdapter adapter;
    private ARecyclerViewHolder holder;

    public TypeARvRender(Context context, RvtAdapter adapter) {
        this.adapter = adapter;
        View view = LayoutInflater.from(context).inflate(R.layout.type_a, null);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        holder = new ARecyclerViewHolder(view);
    }

    @Override
    public ARecyclerViewHolder getReusableComponent() {
        return holder;
    }

    @Override
    public void bindEvents() {

    }

    @Override
    public void bindData(int position) {
        Person p = adapter.getItem(position);
        TextView nameTv = holder.obtainView(R.id.type_a_name);
        nameTv.setText(p.getName());

        TextView ageTv = holder.obtainView(R.id.type_a_age);
        ageTv.setText(String.valueOf(p.getAge()));
    }
}
