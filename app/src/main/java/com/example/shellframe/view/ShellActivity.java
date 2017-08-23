package com.example.shellframe.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shellframe.R;
import com.example.shellframe.base.BaseActivity;
import com.example.shellframe.presenter.IPresenterImpl;

public class ShellActivity extends BaseActivity implements View.OnClickListener, IView {

    private Button button;
    private TextView textView;


    @Override
    protected int getlayout() {
        return R.layout.activity_shell;
    }

    @Override
    protected void initView() {

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(this);
    }

    @Override
    protected void initOnClicklistener() {

    }

    @Override
    protected void initOperation() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                IPresenterImpl loginPresenter = new IPresenterImpl(this);
                loginPresenter.Getcontroller();
                break;
        }
    }

    @Override
    public void OnSucceed(String succed) {
        textView.setText(succed);
    }

    @Override
    public void OnDefeated() {
        Toast.makeText(this, "失败了", Toast.LENGTH_SHORT).show();
    }
}
