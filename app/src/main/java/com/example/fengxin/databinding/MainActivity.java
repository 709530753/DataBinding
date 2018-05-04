package com.example.fengxin.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fengxin.databinding.databinding.ActivityMainBinding;
import com.example.fengxin.databinding.entity.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 初始化数据
        User user = new User();
        user.firstName = "Victor";
        user.lastName = "Fang";
        user.phone = "13333333333";
        user.isShowPhone = false;
        // 绑定数据
        binding.setHandler(new MyHandler());

    }

}
