import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ScannerReview {

    public static void main(String[] args) {
        //create a new file
        File file = new File("colors.txt");

        //create a new scanner
        Scanner sc;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("uh oh. That's not a file.");
            return;
        }

        //while (sc.hasNextLine())
        System.out.println(sc.nextLine());
    }
}
