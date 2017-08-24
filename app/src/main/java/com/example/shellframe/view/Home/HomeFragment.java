package com.example.shellframe.view.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shellframe.R;
import com.example.shellframe.base.BaseFragment;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 张豫耀 on 2017/8/23.
 */

public class HomeFragment extends BaseFragment {
    XRecyclerView mxRecyclerView;
    @BindView(R.id.homefragment_xrv)
    XRecyclerView homefragmentXrv;
    Unbinder unbinder;

    @Override
    protected int layoutID() {
        return R.layout.home_fragment;
    }

    //asd
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
