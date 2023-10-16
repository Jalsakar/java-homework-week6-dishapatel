package homework_week_6;

public class Programme_2 {
    /**
     * Calling Static method to Main method
     */
    static int x = 1000; // Static variable
    static String name = "My World"; // Static variable

    // Static method with Static variables
    public static void myMethod() {
        System.out.println(x);
        System.out.println(name);
    }

    // Main method with Static method
    public static void main(String[] args) {
        myMethod();
    }
} // Run the programme