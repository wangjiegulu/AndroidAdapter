package com.wangjie.androidadapter.view.expandablelistview;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.wangjie.androidadapter.R;

/**
 * Created by wangjie on 11/17/15.
 */
public abstract class ABaseExpandTypeAdapter extends ABaseExpandableListAdapter {

    @TargetApi(Build.VERSION_CODES.DONUT)
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ExpandGroupAdapterTypeRender typeRender;
        if (null == convertView) {
            typeRender = getGroupAdapterTypeRender(groupPosition);
            convertView = typeRender.getReusableComponent();
            convertView.setTag(R.id.aa__id_adapter_item_type_render, typeRender);
            typeRender.bindEvents();
        } else {
            typeRender = (ExpandGroupAdapterTypeRender) convertView.getTag(R.id.aa__id_adapter_item_type_render);
        }
        convertView.setTag(R.id.aa__id_adapter_group_position, groupPosition);

        if (null != typeRender) {
            typeRender.bindData(groupPosition);
        }

        return convertView;
    }

    @TargetApi(Build.VERSION_CODES.DONUT)
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ExpandChildAdapterTypeRender typeRender;
        if (null == convertView) {
            typeRender = getChildAdapterTypeRender(groupPosition, childPosition);
            convertView = typeRender.getConvertView();
            convertView.setTag(R.id.aa__id_adapter_item_type_render, typeRender);
            typeRender.bindEvents();
        } else {
            typeRender = (ExpandChildAdapterTypeRender) convertView.getTag(R.id.aa__id_adapter_item_type_render);
        }
        convertView.setTag(R.id.aa__id_adapter_group_position, groupPosition);
        convertView.setTag(R.id.aa__id_adapter_child_position, childPosition);

        if (null != typeRender) {
            typeRender.bindData(groupPosition, childPosition);
        }

        return convertView;
    }

    /**
     * 根据指定position的item获取对应的type，然后通过type实例化一个AdapterTypeRender的实现
     *
     * @param groupPosition
     * @return
     */
    public abstract ExpandGroupAdapterTypeRender getGroupAdapterTypeRender(int groupPosition);

    /**
     * 根据指定position的item获取对应的type，然后通过type实例化一个AdapterTypeRender的实现
     *
     * @param groupPosition
     * @param childPosition
     * @return
     */
    public abstract ExpandChildAdapterTypeRender getChildAdapterTypeRender(int groupPosition, int childPosition);
}
