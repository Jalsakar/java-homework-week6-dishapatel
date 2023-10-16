package homework_week_6;

import java.util.Scanner;

public class Programme_8_Triangle {
    /**
     * Java programme to calculate the Area of Triangle
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width of the Triangle : ");
        double b = scanner.nextFloat();
        System.out.println("Enter Height of the Triangle : ");
        double h = scanner.nextFloat();
        double area = (b * h) / 2;
        System.out.println("Area of Triangle is : " + area);
        scanner.close();
    }
} // Run the programme