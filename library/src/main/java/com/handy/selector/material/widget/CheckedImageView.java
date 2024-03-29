package com.handy.selector.material.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;

/**
 * Created by Rey on 9/16/2015.
 */
public class CheckedImageView extends ImageView implements Checkable {

    private static final int[] STATE_CHECKED = new int[]{
            android.R.attr.state_checked
    };
    private boolean mChecked = false;

    public CheckedImageView(Context context) {
        super(context);
    }

    public CheckedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckedImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isChecked() {
        return mChecked;
    }

    @Override
    public void setChecked(boolean b) {
        if (mChecked != b) {
            mChecked = b;
            refreshDrawableState();
        }
    }

    @Override
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override
    public int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);

        int[] additionalStates = mChecked ? STATE_CHECKED : null;
        if (additionalStates != null)
            mergeDrawableStates(drawableState, additionalStates);

        return drawableState;
    }
}
