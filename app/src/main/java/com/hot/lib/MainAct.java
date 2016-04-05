package com.hot.lib;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainAct extends Activity {

    TextView tv_main_label;
    ListView lv_main_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void initView(){
        tv_main_label = (TextView) findViewById(R.id.tv_main_label);
        lv_main_list = (ListView) findViewById(R.id.lv_main_list);


    }
}
