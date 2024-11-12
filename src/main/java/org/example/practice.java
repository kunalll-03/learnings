package org.example;

public class practice {
    public static void main(String[] args) {
        int p = 23; /*prime no.*/
        int g = 5; /*primitive no.*/
        int x = 4; /*Alice"s choice*/
        int y = 3; /*Bob's no.*/
        double aliceSends = (Math.pow(g,x))%p;
        double bobSends = (Math.pow(g,y))%p;
        double bobComputes = (Math.pow(aliceSends,y))%
                p;
        double aliceComputes = (Math.pow(bobSends,x))%p;
        double sharedSecret = (Math.pow(g,(x*y)))%p;

        System.out.println("Alice Sends: "+aliceSends);
        System.out.println("Bob Sends: "+bobSends);
        System.out.println("Bob Computes: "+bobComputes);
        System.out.println("Alice Computes: "+aliceComputes);
        System.out.println("Shared Secret: "+sharedSecret);

        if((aliceSends==sharedSecret) && (aliceSends==bobSends)){
            System.out.println("Success Shared Secret Matches!! "+sharedSecret);
        }
        else{
            System.out.println("Error!! Shared Secrets doesn't match!");
        }
    }
}
