package org.example;


import java.util.Scanner;
public class strings_exercise {
    public static void main(String[] args) {
        String name = "Kunal Kumar";
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));

        //problem3
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        System.out.println("Dear " + names +", Thanks a lot!!");

        //problem 4
        String myString = "This String contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String letter2 = "Dear Harry,\n\t This Java course is nice.\nThanks!!";
        System.out.println(letter2);
    }
}
