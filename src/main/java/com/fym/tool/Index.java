package com.fym.tool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Index {

    //两个数的计算
    public  double test_1(String all){
        Count c=new Count();
        int number=0;

        //获取运算符位置
        for(int i=0;i<all.length();i++) {
            char ch = all.charAt(i);

            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                number=i;
                System.out.println("第一个运算符的位置："+number);
                System.out.println("运算符:"+all.charAt(number));
            }
        }
//        System.out.println("=============");

        //获取运算符前后两个数
        String str1=all.substring(0,number);
        String str2=all.substring(number+1,all.length());

        double sum=c.count_1(all.charAt(number),2,Double.valueOf(str2));
        System.out.println("计算："+str1+" "+all.charAt(number)+" "+str2);
        return sum;
    }

    //获取所有运算符的位置，通过集合operatorList储存，
    // 同时获取operatorList中第一个*或者/的位置
    //计算*或者/前后两个值 然后替换
    public Map<String,List> getList(String all){
        int operator=0;
        int prior=0;
        List<Integer> operatorList=new ArrayList<>();
        List<Integer> priorList=new ArrayList<>();

        for(int i=0;i<all.length();i++) {
            char ch = all.charAt(i);

            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                operatorList.add(i);
                if(ch=='*'||ch=='/'){
                    priorList.add(operator);
                }
                operator++;
            }
        }

        Map<String,List> map=new HashMap<>();
        map.put("list1",operatorList);
        map.put("list2",priorList);
        return map;
    }

    //获取第一个括号 返回括号里的内容为一个字符串 优先计算 然后将结果替换掉（）


    //获取所有运算符的位置集合 通过运算符将大字符串分割成一个个小字符串 储存进集合strList中
    public List<String> getStrList(List<Integer> list ){


        return null;
    }
}
