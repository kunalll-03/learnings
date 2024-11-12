package org.example;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.security.MessageDigest;

public class ProofOfWork {


    public static String performProofOfWork(String data, int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        int nonce = 0;
        String hash = calculateHash(data + nonce);


        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash(data + nonce);
        }
        return hash;
    }

    private static String calculateHash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the data");
        String data = sc.nextLine();
        System.out.println("enter the difficulty");
        int difficulty = sc.nextInt();
        System.out.println("Mining block with difficulty: " + difficulty);
        String hash = performProofOfWork(data, difficulty);
        System.out.println("Proof of Work complete. Nonce: " + hash);
    }
}