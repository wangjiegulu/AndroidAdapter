package com.wangjie.androidadapter.view.recyclerview;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.wangjie.androidadapter.R;
import com.wangjie.androidadapter.core.AdapterTypeRender;

/**
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 1/19/15.
 */
public abstract class ARecyclerViewTypeAdapter extends RecyclerView.Adapter<ARecyclerViewHolder> {
    @TargetApi(Build.VERSION_CODES.DONUT)
    @Override
    public ARecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        AdapterTypeRender<ARecyclerViewHolder> render = getAdapterTypeRender(viewType);
        ARecyclerViewHolder holder = render.getReusableComponent();
        holder.itemView.setTag(R.id.aa__id_adapter_item_type_render, render);
        render.bindEvents();
        return holder;
    }

    @TargetApi(Build.VERSION_CODES.DONUT)
    @Override
    public void onBindViewHolder(ARecyclerViewHolder holder, int position) {
        AdapterTypeRender<ARecyclerViewHolder> render = (AdapterTypeRender<ARecyclerViewHolder>) holder.itemView.getTag(R.id.aa__id_adapter_item_type_render);
        render.bindData(position);
    }

    /**
     * 根据指定position的item获取对应的type，然后通过type实例化一个AdapterTypeRender的实现
     *
     * @return
     */
    public abstract AdapterTypeRender<ARecyclerViewHolder> getAdapterTypeRender(int type);
}
