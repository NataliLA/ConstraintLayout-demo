package com.blogspot.nataliprograms.constraintlayoutdemo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;

import com.blogspot.nataliprograms.constraintlayoutdemo.R;

/**
 * Created by NataliLA on 12-1-17.
 */

public class ConstraintButton extends Button {

    public ConstraintButton(Context context) {
        super(context);
    }

    public ConstraintButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ConstraintLayout_Layout);
        for (int i = 0; i < a.length(); i++) {
            if (a.getResourceId(i, 0) > 0) {
                setText(getText() + "; \n "
                        + getResources().getResourceEntryName(a.getResourceId(i, 0)));
            }
        }

        a.recycle();
    }

    public ConstraintButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
