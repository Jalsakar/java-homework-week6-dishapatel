package homework_week_6;

import java.util.Scanner;

public class Programme_5_Calculator {
    /**
     * Java programme for a Calculator with parameters and concatenation methods
     */
    // Two Static methods with parameters and String concatenation methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of two numbers " + a + " and " + b + " is : " + result);
    }
    public static void subtraction(int a, int b) {
        int result = b - a;
        System.out.println("Subtraction of two numbers " + b + " and " + a + " is : " + result);
    }
    // Two Instance methods with parameters and String concatenation methods
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of two numbers " + a + " and " + b + " is : " + result);
    }
    public void divison(int a, int b) {
        int result = a / b;
        System.out.println("Division of two numbers " + a + " and " + b + " is : " + result);
    }
    // Main method with Scanner class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        addition(a, b);
        subtraction(b, a);
        Programme_5_Calculator myObj = new Programme_5_Calculator();
        myObj.multiplication(a, b);
        myObj.divison(a, b);
        scanner.close();
    }
} // Run the programme