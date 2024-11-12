package org.example;
import java.util.Scanner;
public class ex1_boardcalci {
    public static void main(String[] args){
        int total=500;
        System.out.println("Board Percentage Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks Obtained:");
        System.out.println("1st Subject:");
        float a=sc.nextFloat();
        System.out.println("2nd Subject:");
        float b=sc.nextFloat();
        System.out.println("3rd Subject:");
        float c=sc.nextFloat();
        System.out.println("4th Subject:");
        float d=sc.nextFloat();
        System.out.println("5th Subject:");
        float e=sc.nextFloat();
        float sum=a+b+c+d+e;
        float percentage=((sum)/(total))*100;
        System.out.println("The total percentage obtained is:" + percentage);
    }
}
