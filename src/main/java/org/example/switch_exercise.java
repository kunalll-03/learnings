package org.example;
import java.util.Scanner;
public class switch_exercise {
    public static void main(String[] args) {
        //Question 1
        /*int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }*/

        //Question 2
        /*byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter Your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter Your marks in Mathematics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is: " + avg);
        if(avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("Congratulations, You have been promoted!!");
        }
        else{
            System.out.println("Sorry, You have not been promoted!! Please try again!!");
        }*/

        //Question 3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Annual Income(in lakhs):");
        float income = sc.nextFloat();
        float tax = 0;
        if(income<2.5){
            tax = tax+0;
        }
        else if(income>2.5f && income<=5f){
            tax=tax+ 0.05f *(income-2.5f);
            System.out.println("You have to pay a non-refundable tax of: "+tax);
        }
        else if(income>5.0f && income<=10.0f){
            tax = tax +0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(income-2.5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(10.5f-5f);
            tax = tax + 0.3f*(income-10.0f);
        }
        System.out.println("The total tax paid by an employee: "+ tax);*/

        //Question 4
        /*Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }*/

        //Question 4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = sc.nextInt();
        if(year%4==0 && year>1900 && year<=3000){
            System.out.println("It's a leap year!");
        }
        else if(year>3000){
            System.out.println("Please Enter a valid year!");
        }
        else{
            System.out.println("It's not a leap year!!");
        }*/

        //Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Website:");
        String site = sc.nextLine();
        if(site.endsWith(".com")){
            System.out.println("It's a Commercial Website!");
        }
        else if(site.endsWith(".org")){
            System.out.println("It's an Organization Website");
        }
        else if(site.endsWith(".in")){
            System.out.println("It's an Indian Website!");
        }
        else{
            System.out.println("Please Enter a valid Website!");
        }
    }
}
