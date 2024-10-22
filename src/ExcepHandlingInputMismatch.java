import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepHandlingInputMismatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: " + e.getMessage());
        }
    }
}
