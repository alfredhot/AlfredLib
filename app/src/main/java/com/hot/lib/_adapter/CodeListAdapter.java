package com.hot.lib._adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.hot.lib.R;

import java.util.ArrayList;

/**
 * Created by alfredhot-DS on 2016-04-04.
 */
public class CodeListAdapter extends BaseAdapter {
    private ArrayList<CodeItem> mCodeList;
    private Context mContext;
    Holder tempHolder;

    public CodeListAdapter(ArrayList<CodeItem> codeList, Context context) {
        this.mCodeList = codeList;
        this.mContext = context;

        //sorting
        sortListByMark();
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        Holder holder = new Holder();

        if(convertView==null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.act_main_list_item,null);
            holder.tv_codeDes = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codedes);
            holder.tv_codeName = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codename);
            holder.tv_codeLevel = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codelevel);
            holder.tv_codePath = (TextView) convertView.findViewById(R.id.tv_mainlist_item_codepath);
            holder.im_codeMark = (ImageView) convertView.findViewById(R.id.im_mainlist_item_codemark);
            holder.rl_codeMarkLayout = (RelativeLayout) convertView.findViewById(R.id.rl_mainlist_item_codemarklayout);
            holder.rl_codeMarkLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int clickPos = (Integer)v.getTag();
                    v.findViewById(R.id.im_mainlist_item_codemark).setSelected(mCodeList.get(clickPos).toggleCodeMark());
                    Toast.makeText(mContext, "maker,pos:"+clickPos, Toast.LENGTH_SHORT).show();
                }
            });
            convertView.setTag(holder);
        }
        else
        {
            holder = (Holder) convertView.getTag();
        }

        //set Value
        holder.codeItem = mCodeList.get(position);
        holder.tv_codeName.setText(holder.codeItem.getCodeName());
        holder.tv_codeDes.setText(holder.codeItem.getCodeDes());
        holder.tv_codeLevel.setText(holder.codeItem.getCodeLevel());
        holder.tv_codePath.setText(holder.codeItem.getCodePath());
        holder.im_codeMark.setSelected(holder.codeItem.isCodeMark());
        holder.im_codeMark.setTag(position);
        holder.rl_codeMarkLayout.setTag(position);


        return convertView;
    }

    /**
     * 마크된 아이템 우선 보이게 소팅
     */
    private void sortListByMark(){
        ArrayList<CodeItem> tempList = new ArrayList<CodeItem>();

        //add marked items first
        for(CodeItem orgItem: mCodeList){
            if(orgItem.isCodeMark())
                tempList.add(orgItem);
        }

        //add unmarked items
        for(CodeItem orgItem: mCodeList){
            if(!orgItem.isCodeMark())
                tempList.add(orgItem);
        }

        mCodeList = tempList;
    }

    public final class Holder{

        public TextView tv_codeName;
        public TextView tv_codeDes;
        public TextView tv_codeLevel;
        public TextView tv_codePath;
        public ImageView im_codeMark;
        public RelativeLayout rl_codeMarkLayout;
        public CodeItem codeItem;
    }
}
