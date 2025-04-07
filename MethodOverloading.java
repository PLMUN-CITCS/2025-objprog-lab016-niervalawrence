public class MethodOverloading {

    // Method to print integer value
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method to print double value
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Method to print string value
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }

    public static void main(String[] args) {
        // Calling the overloaded methods with different argument types
        printValue(10);          // Calls printValue(int)
        printValue(3.14);        // Calls printValue(double)
        printValue("Hello!");    // Calls printValue(String)
    }
}
