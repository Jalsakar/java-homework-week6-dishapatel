package homework_week_6;

import java.util.Scanner;

public class Programme_6_Circle {
    /**
     * Java programme to calculate Area of a Circle
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle with Radius is : " + area);
        scanner.close();
    }
} // Run the programme