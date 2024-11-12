package codingNinjas;

import java.util.Scanner;

public class Control_flow_statements {
    public static void main(String[] args) {
        /*Control FLow Statements
        1.Decision-Making Statement
          A. If
              if(condition1){
                 code
              }
              else if(condition2){
                 code
              }
              else{
                 code
              }

           B. Switch
              switch(expression){
                 case condition1:
                      code
                      break;
                 case condition2:
                      code
                      break;
                  default:
                      code
              }

        2. Loop Statement
           A. for loop
              for(initialization; condition; increment/decrement){
                code
              }

           B. while loop
              initialization
              while(condition){
                      code..
                      increment/decrement
              }

           C. do while loop
              initialization
              do{
                  code
                  increment/decrement
               }while(condition)

        3. Jump Statement
            A. break
         */

        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd ");
        }

         */
        /*Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a>=b && a>=c) {
            System.out.println(a);
        }
        else if(b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }*/

            int i=0;
            while(i<10)
            {
                i=i+1;
                System.out.print(i);
                i=i+1;
            }


    }
}