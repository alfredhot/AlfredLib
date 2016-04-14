package com.hot.lib.list.tree;

/**
 * Created by alfredhot-DS on 2016-04-14.
 */
public class TreeItem {
    private int id;
    private int parentId;
    private int level;
    private boolean folder;
    private boolean open;
    private boolean show;
    private int childCount;

    private String title;

    public TreeItem(int id, int parentId,int level, boolean folder, boolean open, boolean show, String title){
        this.id = id;
        this.parentId = parentId;
        this.level = level;
        this.folder = folder;
        this.open = open;
        this.show = show;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
