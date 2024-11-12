package org.example;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalculator {
    public static void main(String[] args) {
        String inputString = "Hello, Hashing!";

        // Calculate MD5 hash
        String md5Hash = calculateHash(inputString, "MD5");
        System.out.println("MD5 Hash: " + md5Hash);

        // Calculate SHA-256 hash
        String sha256Hash = calculateHash(inputString, "SHA-256");
        System.out.println("SHA-256 Hash: " + sha256Hash);
    }

    public static String calculateHash(String input, String algorithm) {
        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hashBytes = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                hexString.append(String.format("%02x", hashByte));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Hash algorithm not found: " + algorithm);
            return null;
        }
    }
}
