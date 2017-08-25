package com.example.shellframe.view.announce;

import com.example.shellframe.model.entry.AnnBean;

/**
 * Created by 1 on 2017/8/24.
 */

public interface AnnView {
    void onSuccess(AnnBean annBean);
    void onError(String error);
}
