package com.wangjie.androidadapter.sample.listview.adapter;

import android.content.Context;
import android.view.View;
import com.wangjie.androidadapter.sample.*;
import com.wangjie.androidadapter.core.AdapterTypeRender;
import com.wangjie.androidadapter.sample.model.Person;
import com.wangjie.androidadapter.sample.model.PersonType;
import com.wangjie.androidadapter.view.abslistview.ABaseTypeAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjie on 11/18/15.
 */
public class LvtAdapter extends ABaseTypeAdapter {
    private Context context;
    private List<Person> list = new ArrayList<>();

    public LvtAdapter(Context context) {
        this.context = context;
        list = Util.generatePersonList(20);
    }

    @Override
    public AdapterTypeRender<View> getAdapterTypeRender(int position) {
        AdapterTypeRender<View> render;
        switch (getItemViewType(position)) {
            case PersonType.TYPE_A:
                render = new TypeARender(context, this);
                break;
            case PersonType.TYPE_B:
                render = new TypeBRender(context, this);
                break;
            case PersonType.TYPE_C:
                render = new TypeCRender(context, this);
                break;
            default:
                render = new TypeARender(context, this);
                break;
        }
        return render;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Person getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return PersonType.TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }
}
