package com.example.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO:功能说明
 *
 * @author: hejie
 * @date: 2016-07-20 21:59
 */
public class Square extends View {
    public Square(Context context) {
        super(context, null);
    }

    public Square(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(101, 101);
        bitmaph
    }
}
