package com.handy.selector.picker.file.entity;

import android.graphics.drawable.Drawable;

import com.handy.selector.picker.common.entity.JavaBean;

/**
 * 文件项信息
 *
 * @author 李玉江[QQ:1032694760]
 * @since 2014-05-23 18:02
 */
public class FileItem extends JavaBean {
    private Drawable icon;
    private String name;
    private String path = "/";
    private long size = 0;
    private boolean isDirectory = false;

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public void setDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

}
