package com.xiaogang.com.wanandroid_xg.ui.project;

import android.os.Bundle;
import android.view.View;

import com.xiaogang.com.wanandroid_xg.R;
import com.xiaogang.com.wanandroid_xg.base.BaseFragment;

/**
 * author: fangxiaogang
 * date: 2018/9/19
 */

public class ProjectFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_project;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initView(View view) {

    }

    public static ProjectFragment newInstance() {
        Bundle args = new Bundle();
        ProjectFragment fragment = new ProjectFragment();
        fragment.setArguments(args);
        return fragment;
    }

}