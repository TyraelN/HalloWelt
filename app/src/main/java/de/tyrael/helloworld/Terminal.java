package de.tyrael.helloworld;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class Terminal extends LinearLayout {
    public Terminal(Context context) {
        super(context);
    }

    public Terminal(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Terminal(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Terminal(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
