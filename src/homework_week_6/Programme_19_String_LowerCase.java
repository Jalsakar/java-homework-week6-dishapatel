package homework_week_6;

import java.util.Scanner;

public class Programme_19_String_LowerCase {
    /**
     * Java programme to convert Uppercase String to Lowercase
     * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * Output: the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sample String in Uppercase : ");
        String sampleString = scanner.nextLine();
        System.out.println("Sample String is in Uppercase : " + sampleString.toUpperCase());
        System.out.println("Sample String is in Lowercase : " + sampleString.toLowerCase());
        scanner.close();
    }
} // Run the programme