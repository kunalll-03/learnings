package org.example;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Scanner;

public class ProofOfStake {
    public static String performProofOfStake(String data, int stake) {
        int totalStake = 1000;
        Random rand = new Random();
        int random = rand.nextInt(totalStake);
        if (random <= stake) {
            return calculateHash(data + stake);
        } else {
            return "Stake not selected";
        }
    }


    private static String calculateHash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder(); // This will contain hash as hexadecimal
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


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the data");
        String data = sc.nextLine();
        int stake = 500;
        System.out.println("Performing Proof of Stake with stake: " + stake);
        String hash = performProofOfStake(data, stake);
        System.out.println("Proof of Stake result: " + hash);
    }
}