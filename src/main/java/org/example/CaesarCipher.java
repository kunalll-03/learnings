package org.example;
import java.util.Scanner;
public class CaesarCipher {
    public static String caesarCipher(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                encryptedText.append((char) ((ch - base + shift) % 26 + base));
            } else {
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text to encrypt: ");
        String text = scanner.nextLine();
        System.out.print("Enter the Key: ");
        int shift = scanner.nextInt();
        scanner.nextLine();
        String encryptedText = caesarCipher(text, shift);
        System.out.println("Encrypted text: " + encryptedText);
        scanner.close();
    }
}