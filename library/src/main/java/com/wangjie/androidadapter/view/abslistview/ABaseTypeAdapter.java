package com.wangjie.androidadapter.view.abslistview;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.wangjie.androidadapter.R;
import com.wangjie.androidadapter.core.AdapterTypeRender;

/**
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 9/25/14.
 */
public abstract class ABaseTypeAdapter extends ABaseAdapter {

    @TargetApi(Build.VERSION_CODES.DONUT)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AdapterTypeRender<View> typeRender;
        if (null == convertView) {
            typeRender = getAdapterTypeRender(position);
            convertView = typeRender.getReusableComponent();
            convertView.setTag(R.id.aa__id_adapter_item_type_render, typeRender);
            typeRender.bindEvents();
        } else {
            typeRender = (AdapterTypeRender<View>) convertView.getTag(R.id.aa__id_adapter_item_type_render);
        }
        convertView.setTag(R.id.aa__id_adapter_item_position, position);

        if (null != typeRender) {
            typeRender.bindData(position);
        }

        return convertView;
    }

    /**
     * 根据指定position的item获取对应的type，然后通过type实例化一个AdapterTypeRender的实现
     *
     * @param position
     * @return
     */
    public abstract AdapterTypeRender<View> getAdapterTypeRender(int position);
}
