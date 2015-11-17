package com.wangjie.androidadapter.view.recyclerview.extra;

import android.view.View;
import com.wangjie.androidadapter.core.AdapterTypeRender;

/**
 * 带有header或者footer的view
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 1/22/15.
 */
/*public*/ class ABRecyclerViewTypeExtraRender implements AdapterTypeRender<ABRecyclerViewTypeExtraHolder> {
    protected ABRecyclerViewTypeExtraHolder holder;

    protected ABRecyclerViewTypeExtraRender(View extraView) {
        holder = new ABRecyclerViewTypeExtraHolder(extraView);
    }

    @Override
    public ABRecyclerViewTypeExtraHolder getReusableComponent() {
        return holder;
    }

    @Override
    public void bindEvents() {

    }

    @Override
    public void bindData(int position) {

    }
}
