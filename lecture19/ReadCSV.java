import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadCSV {
    
    public static void main(String[] args) throws FileNotFoundException {
        //read in "courses.csv" using a scanner and print each course name

        //pass the file we want to parse as a command line argument
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);

        sc.nextLine();
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            //System.out.println(line);

            String[] entries = line.split(",");
            System.out.println(entries[0]);

        }

    }

}
