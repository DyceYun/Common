package com.wys.util;

import java.util.Map;
import java.util.function.BiConsumer;

/**
 * <p>集合工具类
 * <br>
 * @author Wanys
 * @version 1.0
 */
public class MapUtil {
    /**
     * 判断集合是否为空
     * @param map
     * @return
     */
    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    /**
     * 判断集合是否非空
     * @param map
     * @return
     */
    public static <K, V> boolean isNotEmpty(Map<K, V> map) {
        return !isEmpty(map);
    }
}
