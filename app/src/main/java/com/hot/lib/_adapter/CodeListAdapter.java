package com.hot.lib._adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.hot.lib.R;

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

        Holder holder = new Holder();

        if(convertView==null && position<mCodeList.size())
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.act_main_list_item,null);
            holder.tv_codeDes = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codedes);
            holder.tv_codeName = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codename);
            holder.tv_codeGenDate = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codegendate);
            holder.tv_codeModDate = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codemoddate);

            //set Value
            holder.codeItem = mCodeList.get(position);
            holder.tv_codeName.setText(holder.codeItem.getCodeName());
            holder.tv_codeDes.setText(holder.codeItem.getCodeDes());
            holder.tv_codeGenDate.setText(holder.codeItem.getCodeGenDateStr());
            holder.tv_codeModDate.setText(holder.codeItem.getCodeModDateStr());

            convertView.setTag(holder);
        }
        else
        {
            holder = (Holder) convertView.getTag();
        }
        return convertView;
    }

    public final class Holder{

        public TextView tv_codeName;
        public TextView tv_codeDes;
        public TextView tv_codeGenDate;
        public TextView tv_codeModDate;
        public CodeItem codeItem;
    }
}
