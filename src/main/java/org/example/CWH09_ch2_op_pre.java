package org.example;

public class CWH09_ch2_op_pre {
    public static void main(String[] args){
        //Precedence and Associativity
        int a= 6*5-34/2;
        /* 6*5-34/2
           30-17
        */
        int b= 60/5-34*2;
        /*Associativity= left to right
           12-34*2
           12-68
       */
        System.out.println(a);
        System.out.println(b);

    }
}
