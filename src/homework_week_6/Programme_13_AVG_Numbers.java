package homework_week_6;

import java.util.Scanner;

public class Programme_13_AVG_Numbers {
    /**
     * Java programme of Average of any three numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = scanner.nextInt();
        System.out.println("Average of Three Numbers is : " + (num1 + num2 + num3) / 3);
        scanner.close();
    }
} // Run the programme