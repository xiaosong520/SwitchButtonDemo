package com.switchbuttondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.switchButton) SwitchButton switchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initViewData();
    }

    private void initViewData() {
        switchButton.setToggleOn(false);//默认打开，参数传False,则打开页面初始化时不会有动画效果(改变状态会有动画)
        switchButton.setOnToggleChanged(new SwitchButton.OnToggleChanged(){
            @Override
            public void onToggle(boolean isOn) {
                Toast.makeText(MainActivity.this,"SwitchButton:"+isOn,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
