package com.fym.demo;

import com.fym.tool.Count;
import com.fym.tool.JosnTool;
import net.sf.json.JSONObject;
import java.util.Map;

public class Demo_1 {

    public static void main(String args[]){
        Count cout=new Count();

        String jsonStr= JosnTool.createJsonString("sss","a+2").toString();
        System.out.println(jsonStr);
        JSONObject jsonObject= JosnTool.createJsonString("sss","a+2");

        Map<Object, Object> map= JosnTool.jsonToMap(jsonStr);
        System.out.println(map.get("sss"));

        System.out.println(cout.test_1((String) map.get("sss")));
    }


}
