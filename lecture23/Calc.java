import java.util.Scanner;
import java.io.File;
public class Calc {

    public static void main(String[] args) {
        int total = 0;

        File f = new File("input.txt");
        Scanner sc;
        try {
            sc = new Scanner(f);
        } catch (Exception e) {
            System.out.println("no file named input.txt");
            return;
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();            
            String[] entries = line.split(" ");

            String op = entries[0];
            int num;
            try {
                num = Integer.parseInt(entries[1]); 
            } catch (Exception e) {
                System.out.println("Invalid format... need to specify OP num");
                continue;
            }

            if (op.equals("ADD")) {
                total += num;
            } else if (op.equals("SUB")) {
                total -= num;
            } else if (op.equals("MUL")) {
                total *= num;
            } else if (op.equals("DIV")) {
                try {
                    total /= num;
                } catch (Exception e) {
                    System.out.println("Can't divide by zero");
                }
            } else {
                System.out.println("OP " + op + " is not supported");
            }
        }

        System.out.println("Total: " + total);

        /*
         * Read data from a text file named "input.txt".
         * Read each line from the file and process it according to the following rules:
         * If the line starts with "ADD", extract the following number and add it to a running total.
         * If the line starts with "SUB", extract the following number and subtract it from the running total.
         * If the line starts with "MUL", extract the following number and multiply it with the running total.
         * If the line starts with "DIV", extract the following number and divide the running total by it (handle division by zero gracefully).
         * Ignore any lines that do not conform to the above rules.
         * Display the final result of the operations performed on the data.
         */
    }
}
