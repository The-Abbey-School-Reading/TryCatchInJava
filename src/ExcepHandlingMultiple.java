public class ExcepHandlingMultiple {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        }
    }
}
