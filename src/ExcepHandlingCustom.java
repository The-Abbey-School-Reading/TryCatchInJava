public class ExcepHandlingCustom {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}
