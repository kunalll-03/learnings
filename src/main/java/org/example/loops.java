package org.example;

public class loops {
    public static void main(String[] args) {
        System.out.println("Using Loops:");
        int k = 100;
        while(k<=200){
            System.out.println(k);
            k++;
        }
        System.out.println("Done!!");

        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b<6);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<100);

        //FOR loop
        int i;
        for(i=100; i!=0; i--){
            System.out.println(i);
        }
    }
}
