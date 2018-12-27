package com.fym.demo;

import com.fym.tool.Index;
import com.fym.tool.JosnTool;
import net.sf.json.JSONObject;

import java.util.Map;

public class Demo_2 {

    public  static  void main(String args[]){
        Index index=new Index();

        JSONObject jsonObject= JosnTool.createJsonString("sss","a+2-3");
        Map<Object, Object> map= JosnTool.jsonToMap(jsonObject.toString());
        System.out.println("转map后获取的字符串："+map.get("sss"));
    }
}
