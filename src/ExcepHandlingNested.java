public class ExcepHandlingNested {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            try {
                System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
    }
}