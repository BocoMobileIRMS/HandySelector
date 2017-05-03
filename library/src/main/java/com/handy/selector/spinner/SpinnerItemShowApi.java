package com.handy.selector.spinner;

import android.support.annotation.NonNull;

/**
 * <pre>
 *  author : LiuJie
 *  desc :
 *  blog : https://github.com/liujie045
 *  createtime : 2017/5/3 10:54
 *  updatetime : 2017/5/3 10:54
 * </pre>
 */
public interface SpinnerItemShowApi<T> {
    String getItemShow(@NonNull T item);
}
