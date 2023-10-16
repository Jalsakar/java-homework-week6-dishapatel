package homework_week_6;

public class Programme_3 {
    /**
     * Calling Instance method and Static method to Main method
     */
    int x = 500; // Instance variable
    static String name = "My World"; // Static variable

    // Instance method
    public void myInstanceMethod() {
        System.out.println(x);
        System.out.println(name);
    }

    // Static method
    public static void myStaticMethod() {
        Programme_3 myObj = new Programme_3();
        System.out.println(myObj.x);
        System.out.println(name);
    }

    // Main method with Instance method via object and Static methods
    public static void main(String[] args) {
        Programme_3 myObj = new Programme_3();
        myObj.myInstanceMethod();
        myStaticMethod();
    }
} // Run the programme