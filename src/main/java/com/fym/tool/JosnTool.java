package com.fym.tool;

import net.sf.json.JSONObject;

import java.util.Map;

public class JosnTool {

    /**
     * 获取json对象
     * @param key
     * @param value
     * @return
     */
    public static JSONObject createJsonString(String key, Object value) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(key, value);
        return jsonObject;
    }

    /**
     * json string 转换为 map 对象
     * @param jsonObj
     * @return
     */
    public static Map<Object, Object> jsonToMap(Object jsonObj) {
        JSONObject jsonObject = JSONObject.fromObject(jsonObj);
        Map<Object, Object> map = (Map)jsonObject;
        return map;
    }

    /**json string 转换为 对象
     * @param jsonObj
     * @param type
     * @return
     */
    public  static <T>  T jsonToBean(Object jsonObj, Class<T> type) {
        JSONObject jsonObject = JSONObject.fromObject(jsonObj);
        T obj =(T)JSONObject.toBean(jsonObject, type);
        return obj;
    }

}
