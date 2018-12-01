package com.wys.util.prop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.util.Map;

/**
 * <p>Properties属性文件读取工具类
 * <br>
 * @author Wanys
 * @version 1.0
 */
public class PropUtil {
    private static final Logger LOG = LoggerFactory.getLogger(PropUtil.class);

    enum ContentType {
        FILE,
        STRING
    }

    /**
     * 读取properties文件
     * @param content 读取的文本内容或文件路径
     * @param type    FILE:读取文件类型 ，STRING：读取字符串类型
     */
    public static Map<String, String> readProp(String content, ContentType type) {
        OrderedProperties properties = null;
        try {
            switch (type) {
                case STRING:
                    properties = new OrderedProperties(content);
                    break;
                case FILE:
                    try (FileInputStream in = new FileInputStream(content)) {
                        properties = new OrderedProperties(in);
                    }
                    break;
            }
        } catch (Exception e) {
            LOG.error("read file failed!", e);
        }
        return properties;
    }

}
