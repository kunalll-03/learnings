package org.example;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Scanner;

public class Digital_Signature {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        KeyPair keyPair = generateKeyPair();
        System.out.print("Enter message to sign: ");
        String message = scanner.nextLine();
        byte[] digitalSignature = sign(message, keyPair.getPrivate());
        boolean verified = verify(message, digitalSignature, keyPair.getPublic());
        System.out.println("Original Message: " + message);
        System.out.println("Digital Signature: " + new String(digitalSignature));
        System.out.println("Verification Result: " + (verified ? "Signature is valid" : "Signature is not valid"));

        scanner.close();
    }
    private static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }
    private static byte[] sign(String message, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        return signature.sign();
    }
    private static boolean verify(String message, byte[] digitalSignature, PublicKey publicKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKey);
        signature.update(message.getBytes());
        return signature.verify(digitalSignature);
    }
}
