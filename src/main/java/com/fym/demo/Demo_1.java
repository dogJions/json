package com.fym.demo;

import com.fym.tool.Count;
import com.fym.tool.Index;
import com.fym.tool.JosnTool;
import net.sf.json.JSONObject;
import java.util.Map;

public class Demo_1 {

    public static void main(String args[]){
        Index index=new Index();
        JSONObject jsonObject= JosnTool.createJsonString("sss","a+2");


        Map<Object, Object> map= JosnTool.jsonToMap(jsonObject.toString());
        System.out.println("转map后获取的字符串："+map.get("sss"));

        System.out.println("a为2的运算结果："+index.test_1((String) map.get("sss")));
    }


}
