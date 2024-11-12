public class diffie_hellman_lab {
    public static void main(String[] args) {
        int p = 23;
        int g = 5;
        int x = 4;
        int y = 3;

        double aliceSends = (Math.pow(g,x))%p;
        double bobSends = (Math.pow(g,y))%p;
        double bobComputes = (Math.pow(aliceSends,y))%p;
        double aliceComputes = (Math.pow(bobSends,x))%p;
        double sharedSecret = (Math.pow(g,(x*y)))%p;
        System.out.println("Welcome to Diffie-Hellman key exchange\n-----------------------------");
        System.out.println("ALice Sends: "+aliceSends);
        System.out.println("Bob Sends: "+bobSends);
        System.out.println("Bob Computes: "+bobComputes);
        System.out.println("Alice Computes: "+aliceComputes);
        System.out.println("Shared Secret: "+sharedSecret);

        if((aliceComputes==bobComputes)&&(aliceComputes==sharedSecret)){
            System.out.println("Success!! The Shared Secret Key Matched!! " +sharedSecret);
        }
        else{
            System.out.println("Error!! It doesn't match with the secret key.");
        }
    }
}
