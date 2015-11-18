package com.wangjie.androidadapter.view.recyclerview.extra;

import android.view.View;
import com.wangjie.androidadapter.core.AdapterTypeRender;

/**
 * 带有header或者footer的view
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 1/22/15.
 */
/*public*/ class ARecyclerViewTypeExtraRender implements AdapterTypeRender<ARecyclerViewTypeExtraHolder> {
    protected ARecyclerViewTypeExtraHolder holder;

    protected ARecyclerViewTypeExtraRender(View extraView) {
        holder = new ARecyclerViewTypeExtraHolder(extraView);
    }

    @Override
    public ARecyclerViewTypeExtraHolder getReusableComponent() {
        return holder;
    }

    @Override
    public void bindEvents() {

    }

    @Override
    public void bindData(int position) {

    }
}
