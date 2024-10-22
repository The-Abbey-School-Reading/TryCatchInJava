public class ExcepHandling2b {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Code to handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}