package homework_week_6;

public class Programme_12_Expressions {
    /**
     * Java programme to compute the specified expressions
     * Test Data : ((25.5 * 3.5 - 3.5 * 3.5) / (40.5-4.5))
     * Expected output : 2.13888888888888889
     */
    public static void main(String[] args) {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double e = (a * b - b * b) / (c - d);
        System.out.println(e);
    }
} // Run the programme