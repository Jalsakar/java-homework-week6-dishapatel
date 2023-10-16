package homework_week_6;

import java.util.Scanner;

public class Programme_9_UpperCase_LowerCase {
    /**
     * Java programme to convert the Uppercase to Lowercase
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String in Uppercase : ");
        String String1 = scanner.nextLine();
        // print uppercase string
        System.out.println("String is in Uppercase : " + String1.toUpperCase());
        // print lowercase string
        System.out.println("String is in Lowercase : " + String1.toLowerCase());
        scanner.close();
    }
} // Run the programme