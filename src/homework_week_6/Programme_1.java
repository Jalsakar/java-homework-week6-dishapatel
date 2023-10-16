package homework_week_6;

public class Programme_1 {
    /**
     * Calling Instance method to Main method
     */
    int x = 100; // Instance variable
    String name = "My World"; // Instance variable

    // Instance method with instance variable
    public void myMethod() {
        System.out.println(x);
        System.out.println(name);
    }

    // Main method with Instance method
    public static void main(String[] args) {
        Programme_1 myObj = new Programme_1();
        myObj.myMethod();
    }
} // Run the programme