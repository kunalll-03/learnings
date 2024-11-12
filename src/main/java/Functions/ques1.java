package Functions;
import java.util.Scanner;
public class ques1 {

    public static void TillN(int n){
        if(n<=0){
            return;
        }
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = sc.nextInt();


    }
}
