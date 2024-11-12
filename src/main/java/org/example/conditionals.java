package org.example;

public class conditionals {
    public static void main(String[] args) {
        int age = 26;
        if(age>18){
            System.out.println("yes boy you can drive!");
        }
        else{
            System.out.println("No boy you cannot drive yet!");
        }

//      Logical AND
        boolean a = true;
        boolean b = false;
        /*if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }*/
//      Logical OR
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        //Logical NOT
        System.out.println("For Logical NOT:");
        System.out.print("Not(A) is ");
        System.out.println(!a);

        System.out.println("\nFor Logical NOT:");
        System.out.print("Not(B) is ");
        System.out.println(!b);
    }
}
