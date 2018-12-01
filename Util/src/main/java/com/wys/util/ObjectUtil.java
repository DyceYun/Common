package com.wys.util;

import com.alibaba.fastjson.JSON;

/**
 * <p>对象工具类
 * <br>
 * @author Wanys
 * @version 1.0
 */
public class ObjectUtil {

    /**
     * 对象转字符串
     * @param t 对象
     * @param <T> 对象类型
     * @return 对象的字符串格式
     */
    public static <T> String makeToString(T t) {
        return JSON.toJSONString(t);
    }
}
