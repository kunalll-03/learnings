package org.example;

public class arrays {
    public static void main(String[] args) {
        /*
        //classroom of 500 students- store marks of 500 students
        int [] marks = {80, 90, 86, 90, 99};
        System.out.println(marks[3]);
        System.out.println(marks[0]);
        System.out.println(marks.length);

        //using 'for' loop to display
        System.out.println("printing using for loop");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        //reverse order
        for(int j=marks.length-1;j>=0;j--){
            System.out.println(marks[j]);
        }
        //for each loop
        for(int element: marks){
            System.out.println(element);
        }*/

        //To create multidimensional arrays
        int [][] flats;
        flats = new int [2][3];
        flats [0][0] = 201;
        flats [0][1] = 202;
        flats [0][2] = 203;
        flats [1][0] = 101;
        flats [1][1] = 102;
        flats [1][2] = 102;

        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
