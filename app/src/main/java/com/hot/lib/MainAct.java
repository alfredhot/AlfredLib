package com.hot.lib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.hot.lib._adapter.CodeItem;
import com.hot.lib._adapter.CodeListAdapter;
import com.hot.lib.list.tree.TreeAct;

import java.util.ArrayList;

public class MainAct extends Activity {

    TextView tv_main_label;
    ListView lv_main_list;
    ArrayList<CodeItem> codeList;
    CodeListAdapter adapter;
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
        //가라데이타
        initDate();
        adapter = new CodeListAdapter(codeList,this);
        lv_main_list.setAdapter(adapter);
        lv_main_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainAct.this, TreeAct.class);
                startActivity(intent);
            }
        });

    }
    private void initDate(){
        codeList = new ArrayList<CodeItem>();
        codeList.add(new CodeItem(0,"WebView","기본WebView사용","WebView","webview.WebViewAct",true));
        codeList.add(new CodeItem(1,"Anyone","기본WebView사용","WebView","webview.WebViewAct",true));
        codeList.add(new CodeItem(2,"Someone","기본WebView사용","WebView","webview.WebViewAct",true));
        codeList.add(new CodeItem(3,"Somebody","기본WebView사용","WebView","webview.WebViewAct",true));
        codeList.add(new CodeItem(4,"Noone","기본WebView사용","WebView","webview.WebViewAct",false));
        codeList.add(new CodeItem(5,"Nobody","기본WebView사용","WebView","webview.WebViewAct",false));
        codeList.add(new CodeItem(6,"Anybody","기본WebView사용","WebView","webview.WebViewAct",false));
        codeList.add(new CodeItem(7,"Anytime","기본WebView사용","WebView","webview.WebViewAct",false));
        codeList.add(new CodeItem(8,"SomeTime","기본WebView사용","WebView","webview.WebViewAct",false));
        codeList.add(new CodeItem(9,"Me","기본WebView사용","WebView","webview.WebViewAct",true));
        codeList.add(new CodeItem(10,"You","기본WebView사용","WebView","webview.WebViewAct",false));
        codeList.add(new CodeItem(11,"Now","기본WebView사용","WebView","webview.WebViewAct",false));
    }
}
