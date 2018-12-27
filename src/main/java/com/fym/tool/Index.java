package com.fym.tool;

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
}
