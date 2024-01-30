//Notice the import
import java.util.Scanner;

public class ScannerReading {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    int leapYear = myScanner.nextInt();
    int leapYear2 = leapYear + 4;
    int leapYear3 = leapYear2 + 4;

    System.out.printf("The next two leap years are %d and %d", leapYear2, leapYear3);
    
  }

}
