public class ExcepHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            // Code to handle any exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
