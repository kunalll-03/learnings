package org.example;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        System.out.println("Enter Your Age!!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using Java Code!!");
        /*int age;
        System.out.println("Enter Your Age!!");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You have no experience at all!");
        }*/
    }
}
