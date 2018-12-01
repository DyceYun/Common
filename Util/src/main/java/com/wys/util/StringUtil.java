package com.wys.util;

/**
 * <p>字符串工具类
 * <br>
 * @author Wanys
 * @version 1.0
 * @createTime 2018/12/1
 * @ChangeLog
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串是否为空白字符
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        return isEmpty(str) || str.trim().isEmpty();
    }

    /**
     * 判断字符串是否非空白字符
     * @param str
     * @return
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}