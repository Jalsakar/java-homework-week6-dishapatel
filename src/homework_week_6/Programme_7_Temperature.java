package homework_week_6;

import java.util.Scanner;

public class Programme_7_Temperature {
    /**
     * Java programme to insert any temperature value in degree Fahrenheit and convert to degree Celsius
     */
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in degree Fahrenheit : ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in degree Celsius : " + celsius);
        scanner.close();
    }
} // Run the programme