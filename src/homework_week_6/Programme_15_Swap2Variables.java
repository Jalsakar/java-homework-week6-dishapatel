package homework_week_6;

import java.util.Scanner;

public class Programme_15_Swap2Variables {
    /**
     * Java programme to swap two variables
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable : ");
        int x = scanner.nextInt();
        System.out.println("Enter the second variable : ");
        int y = scanner.nextInt();
        int z = x;
        x = y;
        y = z;
        System.out.println("Variable before swapping : x ,y = " + x + ", " + y);
        System.out.println("Variable after swapping : y, x = " + y + ", " + x);
        scanner.close();
    }
} // Run the programme