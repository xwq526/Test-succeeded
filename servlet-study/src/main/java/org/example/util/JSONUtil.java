package org.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {

    //jackson框架中，对json字符串和java对象之间互相转换的类
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 序列化操作：java对象序列化为json字符串
     * @param o java对象
     * @return json字符串
     */
    public static String serialize(Object o) {
        try {
            return MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("java对象序列化为JSON字符串出错：" + o);
        }
    }
}
