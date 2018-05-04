package com.example.fengxin.databinding;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by fengxin on 05/03/2018.
 */

public class MyTask implements Runnable{

    private Context mContext;

    public MyTask(Context context) {
        mContext = context;
    }

    @Override
    public void run() {
        Toast.makeText(mContext, "执行任务", Toast.LENGTH_SHORT).show();
    }
}
