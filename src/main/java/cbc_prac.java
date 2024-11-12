public class cbc_prac {
    public static void main(String[] args) {
        int p =23;
        int g = 5;
        int x = 4;
        int y = 3;

        double aliceSends = (Math.pow(g,x))%p;
        double bobSends = (Math.pow(g,y))%p;
        double aliceComp = (Math.pow(bobSends,x))%p;
        double bobComp = (Math.pow(aliceSends,y))%p;
        double sharedSecret = (Math.pow(g,(x*y)))%p;

        System.out.println("Alice Sends = "+aliceSends);
        System.out.println("Bob Send = "+bobSends);
        System.out.println("aliceComp = "+aliceComp);
        System.out.println("bobComp = "+bobComp);
        System.out.println("Shared Secret = "+sharedSecret);

        if((aliceComp==bobComp)&&(aliceComp==sharedSecret)){
            System.out.println("It's a success");
        }
        else {
            System.out.println("There's an error");
        }
    }
}
