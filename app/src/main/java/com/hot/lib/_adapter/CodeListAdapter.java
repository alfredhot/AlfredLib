package com.hot.lib._adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

/**
 * Created by alfredhot-DS on 2016-04-04.
 */
public class CodeListAdapter extends BaseAdapter {
    private ArrayList<CodeItem> mCodeList;
    private Context mContext;

    public CodeListAdapter(ArrayList<CodeItem> codeList, Context context) {
        this.mCodeList = codeList;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mCodeList.size();
    }

    @Override
    public Object getItem(int position) {
        return mCodeList.get(position)==null?null:mCodeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    class Holder{

    }
}
