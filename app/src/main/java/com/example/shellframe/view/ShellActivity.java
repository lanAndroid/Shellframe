package com.example.shellframe.view;

import android.os.Process;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.RadioButton;

import com.example.shellframe.R;
import com.example.shellframe.Utils.FragmentBuilder;
import com.example.shellframe.base.BaseActivity;
import com.example.shellframe.base.BaseFragment;
import com.example.shellframe.view.Announce.AnnounceFragment;
import com.example.shellframe.view.Home.HomeFragment;
import com.example.shellframe.view.LiveChina.LiveFragment;
import com.example.shellframe.view.Streaming.StreamingFragment;
import com.example.shellframe.view.Video.VideoFragment;

import java.sql.SQLException;

import butterknife.BindView;
import butterknife.OnClick;

public class ShellActivity extends BaseActivity {

    @BindView(R.id.home_btn)
    RadioButton homeBtn;
    @BindView(R.id.streaming_btn)
    RadioButton streamingBtn;
    @BindView(R.id.video_btn)
    RadioButton videoBtn;
    @BindView(R.id.announce_btn)
    RadioButton announceBtn;
    @BindView(R.id.live_btn)
    RadioButton liveBtn;

    @Override
    protected int layoutID() {
        return R.layout.activity_shell;
    }

    @Override
    protected void initView() throws SQLException {
    }

    @Override
    protected void loadData() {
        FragmentBuilder.getInstance().start(HomeFragment.class, R.id.overall_frame).builder();
        //     FragmentBuilder.getInstance().builder();
    }

    @Override
    protected void initListener() {

    }


    @OnClick({R.id.home_btn, R.id.streaming_btn, R.id.video_btn, R.id.announce_btn, R.id.live_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_btn:
                FragmentBuilder.getInstance().start(HomeFragment.class, R.id.overall_frame).builder();

                break;
            case R.id.streaming_btn:
                FragmentBuilder.getInstance().start(StreamingFragment.class, R.id.overall_frame).builder();
                //   FragmentBuilder.getInstance().builder();
                break;
            case R.id.video_btn:
                FragmentBuilder.getInstance().start(VideoFragment.class, R.id.overall_frame).builder();
                //    FragmentBuilder.getInstance().builder();
                break;
            case R.id.announce_btn:
                FragmentBuilder.getInstance().start(AnnounceFragment.class, R.id.overall_frame).builder();
                //     FragmentBuilder.getInstance().builder();
                break;
            case R.id.live_btn:
                FragmentBuilder.getInstance().start(LiveFragment.class, R.id.overall_frame).builder();
                //    FragmentBuilder.getInstance().builder();
                break;
        }
        //    FragmentBuilder.getInstance().builder();
    }

    @Override
    public void onBackPressed() {

        FragmentManager manager = getSupportFragmentManager();
        FragmentManager.BackStackEntry entry = manager.getBackStackEntryAt(manager.getBackStackEntryCount() - 1);
        String name = entry.getName();
        if ("HomeFragment".equals(name) || "StreamingFragment".equals(name)
                || "VideoFragment".equals(name) || "AnnounceFragment".equals(name) || "LiveFragment".equals(name)) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        } else {
            manager.popBackStackImmediate();
            String fragmentName = manager.getBackStackEntryAt(manager.getBackStackEntryCount() - 1).getName();
            BaseFragment fragment = (BaseFragment) manager.findFragmentByTag(fragmentName);
            FragmentBuilder.getInstance().setLastFragment(fragment);
        }

    }

}
