package com.hot.lib.list.tree;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hot.lib.R;
import com.hot.lib._adapter.CodeListAdapter;

import java.util.ArrayList;

/**
 * Created by alfredhot-DS on 2016-04-14.
 */
public class TreeAdapter extends BaseAdapter {

    ArrayList<TreeItem> treeList;
    Context context;

    public TreeAdapter(Context pContext, ArrayList<TreeItem> pTreeList){
        context = pContext;
        treeList = pTreeList;
    }

    @Override
    public int getCount() {
        return treeList.size();
    }

    @Override
    public Object getItem(int position) {
        return treeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if(convertView==null){
            holder = new Holder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_tree_list,null);
            holder.im_item_tree_icon = (ImageView) convertView.findViewById(R.id.im_item_tree_icon);
            holder.im_item_tree_level_state = (ImageView) convertView.findViewById(R.id.im_item_tree_level_state);
            holder.im_item_tree_level_line = (ImageView) convertView.findViewById(R.id.im_item_level_line);
            holder.ll_item_tree_level_container = (LinearLayout) convertView.findViewById(R.id.ll_item_tree_level_container);
            holder.tv_item_tree_size = (TextView) convertView.findViewById(R.id.tv_item_tree_size);
            holder.tv_item_tree_title = (TextView) convertView.findViewById(R.id.tv_item_tree_title);
            holder.item = treeList.get(position);
            convertView.setTag(holder);
        }else{
            holder = (Holder) convertView.getTag();
        }

        holder.tv_item_tree_title.setText(holder.item.getTitle());
        holder.tv_item_tree_size.setText(holder.item.getChildCount()+"");
        holder.im_item_tree_icon.setImageResource(holder.item.isFolder()?R.drawable.tree_icon_folder:R.drawable.tree_icon_file);
        if(holder.item.isFolder()){
            holder.im_item_tree_level_state.setImageResource(holder.item.isOpen()?R.drawable.tree_icon_open:R.drawable.tree_icon_closed);
            holder.im_item_tree_level_state.setVisibility(View.VISIBLE);
        }else{
            holder.im_item_tree_level_state.setVisibility(View.GONE);
        }

        holder.ll_item_tree_level_container.removeAllViews();
        for(int i= 0; i<holder.item.getLevel() ; i++){
//            ImageView im_line = (ImageView) LayoutInflater.from(context).inflate(R.layout.item_tree_list,null).findViewById(R.id.im_item_level_line);
//            im_line.setVisibility(View.VISIBLE);
            ImageView im_line = new ImageView(context);

            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(60, ViewGroup.LayoutParams.MATCH_PARENT);
            im_line.setLayoutParams(layoutParams);
//            im_line.setImageResource(R.drawable.tree_icon_line);
            im_line.setBackgroundResource(R.drawable.tree_icon_line);
            holder.ll_item_tree_level_container.addView(im_line);
        }

        convertView.setVisibility(holder.item.isShow()?View.VISIBLE:View.GONE);

        return convertView;
    }

    void sortList(){
        int deep = getLevelDeep(treeList);
        ArrayList<TreeItem> tempList = new ArrayList<TreeItem>();
        while(getLevelCount(treeList,0)>0){
            for(int j = 0; j<treeList.size() ; j++){
                if(treeList.get(j).getLevel()== 0){
                    tempList.add(treeList.get(j));
                    treeList.remove(j);

                    break;
                }
            }
        }
    }

    TreeItem stoleChild(ArrayList<TreeItem> fromList, ArrayList<TreeItem> toList, TreeItem parent){
        for(int i=0; i< fromList.size() ; i++){
            if(fromList.get(i).getParentId() == parent.getId()){
//                if()
            }
        }

        return null;
    }

    int getLevelCount(ArrayList<TreeItem> list,int level){
        int count = 0;
        for(TreeItem item : list){
            if(item.getLevel()==level) count++;
        }
        return count;
    }
    TreeItem getItemById(ArrayList<TreeItem> list, int id){
        for(TreeItem item : list){
            if(item.getId()==id) return item;
        }
        return null;
    }

    int getLevelDeep(ArrayList<TreeItem> list){
        int deep = 0;
        while(1>0){
            if(getLevelCount(list, deep)>0)
                deep++;
            else
                break;
        }
        return deep;
    }


    class Holder{
        TreeItem item;
        LinearLayout ll_item_tree_level_container;
        ImageView im_item_tree_level_state;
        ImageView im_item_tree_icon;
        ImageView im_item_tree_level_line;
        TextView tv_item_tree_title;
        TextView tv_item_tree_size;
    }
}
