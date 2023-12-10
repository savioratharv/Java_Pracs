import java.util.*;

public class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;
        int blankSpaceCount = 0;
        int wordCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetCount++;
                if (isVowel(c)) {
                    vowelCount++;
                } 
                else {
                    consonantCount++;
                }
            } 
            else if (Character.isDigit(c)) {
                digitCount++;
            } 
            else if (Character.isWhitespace(c)) {
                blankSpaceCount++;
            } 
            else {
                specialSymbolCount++;
            }
        }
        String[] words = sentence.split("\\s+");
        wordCount = words.length;
        System.out.println("Alphabets: " + alphabetCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Symbols: " + specialSymbolCount);
        System.out.println("Blank Spaces: " + blankSpaceCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
    private static boolean isVowel(char c) {
        char lowercaseChar = Character.toLowerCase(c);
        return lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u';
    }
}