package placement_training;


import java.util.Scanner;
class cake{
    void area(int x){
        System.out.println("Area = "+ x*x);
    }
    void area(int x,int y) {
        System.out.println("Area = " + x * y);
    }
}

public class class4 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        cake size = new cake();
        size.area(x);
        size.area(x,y);
        System.out.println();

    }
}