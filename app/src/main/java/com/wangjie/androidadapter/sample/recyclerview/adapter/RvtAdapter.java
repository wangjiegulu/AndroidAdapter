package com.wangjie.androidadapter.sample.recyclerview.adapter;

import android.content.Context;
import com.wangjie.androidadapter.core.AdapterTypeRender;
import com.wangjie.androidadapter.sample.Util;
import com.wangjie.androidadapter.sample.model.Person;
import com.wangjie.androidadapter.sample.model.PersonType;
import com.wangjie.androidadapter.view.recyclerview.ARecyclerViewTypeAdapter;
import com.wangjie.androidadapter.view.recyclerview.ARecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjie on 11/18/15.
 */
public class RvtAdapter extends ARecyclerViewTypeAdapter {
    private Context context;
    private List<Person> list = new ArrayList<>();

    public RvtAdapter(Context context) {
        this.context = context;
        list = Util.generatePersonList(20);
    }

    @Override
    public AdapterTypeRender<ARecyclerViewHolder> getAdapterTypeRender(int type) {
        AdapterTypeRender<ARecyclerViewHolder> render;
        switch (type) {
            case PersonType.TYPE_A:
                render = new TypeARvRender(context, this);
                break;
            case PersonType.TYPE_B:
                render = new TypeBRvRender(context, this);
                break;
            case PersonType.TYPE_C:
                render = new TypeCRvRender(context, this);
                break;
            default:
                render = new TypeARvRender(context, this);
                break;
        }
        return render;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public Person getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }
}
