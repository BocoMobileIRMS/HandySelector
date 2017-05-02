package com.handy.selector.dialog;

import android.app.Activity;
import android.os.Build;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2017/2/15 0015.
 *
 * 参考:https://zhuanlan.zhihu.com/p/25221428
 */

public class DialogManager {
    private static DialogManager sInstance = new DialogManager();
    private WeakReference<Activity> sCurrentActivityWeakRef;

    private DialogManager() {

    }

    public static DialogManager getInstance() {
        return sInstance;
    }

    public Activity getCurrentActivity() {
        Activity currentActivity = null;
        if (sCurrentActivityWeakRef != null) {
            currentActivity = sCurrentActivityWeakRef.get();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                if(currentActivity ==null || currentActivity.isDestroyed()){
                    currentActivity = null;
                }
            }
        }
        return currentActivity;
    }

    public void setCurrentActivity(Activity activity) {
        StyledDialog.init(activity);
        sCurrentActivityWeakRef = new WeakReference<Activity>(activity);
    }
}
