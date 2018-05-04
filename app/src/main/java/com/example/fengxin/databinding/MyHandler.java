package com.example.fengxin.databinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by fengxin on 05/03/2018.
 */

public class MyHandler {
    public void showTost(View view) {
        Toast.makeText(view.getContext(), "展示吐司", Toast.LENGTH_SHORT).show();
    }

    public void onEventListenerExecute(MyTask task) {
        task.run();
    }
}
