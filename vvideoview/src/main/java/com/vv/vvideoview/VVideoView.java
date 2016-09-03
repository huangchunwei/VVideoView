package com.vv.vvideoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by VV on 2016/9/3.
 */
public class VVideoView extends SurfaceView {

    public VVideoView(Context context) {
        this(context, null);
    }

    public VVideoView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }
}
