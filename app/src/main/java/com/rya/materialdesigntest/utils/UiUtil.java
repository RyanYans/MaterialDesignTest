package com.rya.materialdesigntest.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Process;
import android.view.View;

import com.rya.materialdesigntest.global.GlobalApplication;

/**
 * Created by Rya32 on 广东石油化工学院.
 * Version 1.0
 */

public class UiUtil {


    public static Context getContext() {
        return GlobalApplication.getContext();
    }

    public static Handler getHandler() {
        return GlobalApplication.getHandler();
    }

    public static int getMainThreadId() {
        return GlobalApplication.getMainThreadId();
    }

    public static String getString(int id) {
        return GlobalApplication.getContext().getResources().getString(id);
    }

    public static String[] getStringArr(int id) {
        return GlobalApplication.getContext().getResources().getStringArray(id);
    }

    public static int getColor(int id) {
        if (GlobalApplication.getSdkVersion() >= 23) {
            return GlobalApplication.getContext().getResources().getColor(id, null);
        }
        return GlobalApplication.getContext().getResources().getColor(id);
    }

    public static Drawable getDrawerable(int id) {
        if (GlobalApplication.getSdkVersion() >= 23) {
            return GlobalApplication.getContext().getResources().getDrawable(id, null);
        }
        return GlobalApplication.getContext().getResources().getDrawable(id);
    }

    public static float getDimen(int id) {
        return GlobalApplication.getContext().getResources().getDimension(id);

    }

    public static View inflate(int resource) {
        return View.inflate(GlobalApplication.getContext(), resource, null);
    }

    public static int dip2px(int dip) {
        float density = GlobalApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dip * density + 0.5);
    }

    public static float px2dip(int px) {
        float density = GlobalApplication.getContext().getResources().getDisplayMetrics().density;
        return px / density;
    }

    public static boolean isRunOnUIThread() {

        int myTid = Process.myTid();
        return GlobalApplication.getMainThreadId() == myTid;
    }

    public static void runOnUIThread(Runnable r) {
        if (isRunOnUIThread()) {
            r.run();
        } else {
            getHandler().post(r);
        }

    }


}
