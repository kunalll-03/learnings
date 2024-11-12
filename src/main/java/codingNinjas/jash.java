package codingNinjas;
import java.util.Scanner;

public class jash {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String str = scanner.next();

            int[] vowelCount = new int[5]; // to store the count of each vowel
            vowelCount[0] = countVowels(str, 'a');
            vowelCount[1] = countVowels(str, 'e');
            vowelCount[2] = countVowels(str, 'i');
            vowelCount[3] = countVowels(str, 'o');
            vowelCount[4] = countVowels(str, 'u');

            int maxCount = 0;
            char mostFrequentVowel = 'a';
            for (int i = 0; i < 5; i++) {
                if (vowelCount[i] > maxCount) {
                    maxCount = vowelCount[i];
                    switch (i) {
                        case 0:
                            mostFrequentVowel = 'a';
}}
