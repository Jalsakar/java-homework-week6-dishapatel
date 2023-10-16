package homework_week_6;

import java.util.Scanner;

public class Programme_10_MultiplicationTable {
    /**
     * Java programme of Multiplication table of 8 up to 10
     * Test Data : any number (Example: 8)
     * Expected Output :
     * 8 x 1 = 8
     * 8 x 2 = 16
     * 8 x 3 = 24
     * ...
     * 8 x 10 = 80
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; ++i) {
        System.out.println(n + "*" + i + " = " + (n * i));}
        scanner.close();
    }
} // Run the programme