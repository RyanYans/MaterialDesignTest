package com.rya.materialdesigntest.fragment;

import android.view.View;

import com.rya.materialdesigntest.view.LoadingPager;

/**
 * Created by Rya32 on 广东石油化工学院.
 * Version 1.0
 */

public class AppFragment extends BaseFragment {

    @Override
    protected View onCreateSuccessView() {
        return null;
    }

    @Override
    protected LoadingPager.ResultState onLoad() {
        return LoadingPager.ResultState.ERROR;
    }
}
