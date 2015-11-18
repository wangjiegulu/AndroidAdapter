package com.wangjie.androidadapter.sample;

import android.util.SparseArray;
import android.view.View;
import com.wangjie.androidadapter.sample.model.Person;
import com.wangjie.androidadapter.sample.model.PersonType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wangjie on 11/18/15.
 */
public class Util {
    public final static Random RANDOM = new Random();

    public static List<Person> generatePersonList(int size) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Person p = new Person();
            p.setAge(Util.RANDOM.nextInt(18) + 10);
            p.setName("item name_" + i);
            p.setType(Util.RANDOM.nextInt(PersonType.TYPE_COUNT));
            list.add(p);
        }
        return list;
    }


    /**
     * 适用于Adapter中简化ViewHolder相关代码
     *
     * @param convertView
     * @param id
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T extends View> T obtainView(View convertView, int id) {
        SparseArray<View> holder = (SparseArray<View>) convertView.getTag();
        if (holder == null) {
            holder = new SparseArray<View>();
            convertView.setTag(holder);
        }
        View childView = holder.get(id);
        if (childView == null) {
            childView = convertView.findViewById(id);
            holder.put(id, childView);
        }
        return (T) childView;
    }

}
