package homework_week_6;

public class Programme_4 {
    // Instance variables
    int x = 100;
    String name = "Disha";
    // Static variables
    static int y = 200;
    static String surname = "Patel";

    // instance method
    public void myInstanceMethod() {
        Programme_4 myObj = new Programme_4();
        System.out.println(x);
        System.out.println(myObj.y);
        System.out.println(name);
        System.out.println(myObj.surname);
    }

    // Static method
    public static void myStaticMethod() {
        Programme_4 myObj = new Programme_4();
        System.out.println(myObj.x);
        System.out.println(y);
        System.out.println(myObj.name);
        System.out.println(surname);
    }

    // main method
    public static void main(String[] args) {
        Programme_4 myObj = new Programme_4();
        myObj.myInstanceMethod();
        myStaticMethod();
    }
}