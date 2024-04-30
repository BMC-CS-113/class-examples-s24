import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));
        int sum = 0;
        while (sc.hasNextLine()) {
           sum += Integer.parseInt(sc.nextLine()); 
        }
        System.out.println(sum);
    }
}
