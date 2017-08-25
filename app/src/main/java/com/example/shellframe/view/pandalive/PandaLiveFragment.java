package com.example.shellframe.view.pandalive;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shellframe.R;
import com.example.shellframe.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 张豫耀 on 2017/8/23.
 * 熊猫直播
 */

public class PandaLiveFragment extends BaseFragment {
    @BindView(R.id.pl_tavlayout)
    TabLayout plTavlayout;
    @BindView(R.id.pl_viewpager)
    ViewPager plViewpager;
    Unbinder unbinder;

    @Override
    protected int layoutID() {
        return R.layout.pandalive_fragment;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void loadData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
