package com.hot.lib.list.tree;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.hot.lib.R;

import java.util.ArrayList;

public class TreeAct extends Activity {

    ListView treeView;
    TreeAdapter treeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tree);
        treeView = (ListView) findViewById(R.id.lv_tree_list);
        treeView.setAdapter(new TreeAdapter(this,initData()));
    }

    ArrayList<TreeItem> initData(){
        ArrayList<TreeItem> treeList = new ArrayList<TreeItem>();
        TreeItem tempItem;
        tempItem = new TreeItem(0,-1,0,true,true,true,"ROOT");
        treeList.add(tempItem);
        tempItem = new TreeItem(1,0,1,true,true,true,"folder1");
        treeList.add(tempItem);
        tempItem = new TreeItem(2,1,2,true,true,true,"folder2");
        treeList.add(tempItem);
        tempItem = new TreeItem(3,1,2,false,true,true,"file1.txt");
        treeList.add(tempItem);
        tempItem = new TreeItem(4,2,3,false,true,true,"file2.txt");
        treeList.add(tempItem);
        tempItem = new TreeItem(5,0,1,false,true,true,"file3.txt");
        treeList.add(tempItem);
        return treeList;
    }
}
