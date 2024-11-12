package placement_training;
import java.util.Scanner;
public class class3 {

    public static boolean IsPrime(int n){
        for(int d = 2; d<n; d++){
            if(n%d == 0){
                return false;
            }
            d++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ansPrime = IsPrime(n);
        System.out.println(ansPrime);
    }
}
