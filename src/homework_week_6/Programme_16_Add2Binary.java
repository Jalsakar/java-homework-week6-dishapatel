package homework_week_6;

import java.util.Scanner;

public class Programme_16_Add2Binary {
    /**
     * Java programme to add two binary numbers
     * first binary number : 10
     * second binary numbers : 11
     * output = 101
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input first binary number : ");
        String a = scanner.nextLine();
        System.out.println(" Input second binary number : ");
        String b = scanner.nextLine();
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int output = num1 +num2;
        System.out.println(" Output in binary = " + Integer.toBinaryString(output));
        scanner.close();
    }
} // Run the programme