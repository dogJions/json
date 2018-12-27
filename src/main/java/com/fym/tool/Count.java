package com.fym.tool;

public class Count {

    public double count_1(char ch,double number1,double number2){

        double sum=0;

        switch (ch){
            case '+':
                 sum=number1+number2;
                break;
            case '-':
                sum=number1-number2;
                break;
            case '*':
                sum=number1*number2;
                break;
            case '/':
                sum=number1/number2;
                break;
        }
        return sum;
    }


}
