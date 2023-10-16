package homework_week_6;

import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    /**
     * Java programme to convert a decimal to binary number
     * input decimal number : 5
     * output binary number : 101
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // decimal number
        System.out.println("Input decimal number : ");
        double dec = scanner.nextDouble();
        // convert decimal to binary
        String binary = Integer.toString((int) dec);
        System.out.println( "Output binary number : " + Integer.toBinaryString(Integer.parseInt(binary)));
        scanner.close();
    }
} // Run the programme