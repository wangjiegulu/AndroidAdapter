package com.wangjie.androidadapter.view.recyclerview.extra;

import android.view.View;
import com.wangjie.androidadapter.view.recyclerview.ARecyclerViewHolder;

/**
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 1/22/15.
 */
public class ARecyclerViewTypeExtraHolder extends ARecyclerViewHolder {
    public ARecyclerViewTypeExtraHolder(View itemView) {
        super(itemView);
    }

    /**
     * 保存当前position（list index，不包括headerView和footerView）
     */
    private int realItemPosition;

    public int getRealItemPosition() {
        return realItemPosition;
    }

    protected void setRealItemPosition(int realItemPosition) {
        this.realItemPosition = realItemPosition;
    }

}
