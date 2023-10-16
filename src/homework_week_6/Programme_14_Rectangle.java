package homework_week_6;

public class Programme_14_Rectangle {
    /**
     * Java programme for area and perimeter of a rectangle
     * Test Data: Width = 5.5, Height = 8.5
     * Expected Output: Area is 5.5 * 8.5 Perimeter is 2*(5.5+8.5)=28
     */
    public static void main(String[] args) {
        double height = 8.5;
        double width = 5.5;
        double area = height * width;
        double perimeter = 2 * (height + width);
        System.out.println("Area is 5.5 * 8.5 = " + area);
        System.out.println("Perimeter is 2 * (5.5 + 8.5) = " + perimeter);
    }
} // Run the programme