package com.wys.util;

import java.util.Collection;

/**
 * <p>集合工具类
 * <br>
 * @author Wanys
 * @version 1.0
 * @createTime 2018/12/1
 * @ChangeLog
 */
public class CollectionUtil {

    /**
     * 判断集合是否为空
     * @param collection
     * @return
     */
    public static <E> boolean isEmpty(Collection<E> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断集合是否非空
     * @param collection
     * @return
     */
    public static <E> boolean isNotEmpty(Collection<E> collection) {
        return !isEmpty(collection);
    }

}
