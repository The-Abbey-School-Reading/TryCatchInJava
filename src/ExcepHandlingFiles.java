import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepHandlingFiles {

    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}
