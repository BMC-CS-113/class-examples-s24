import java.util.Scanner;

public class LeapYears {
  
  static int getNextLeapYear(int year) {
    return year + 4;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();

    //a lot of repeated code

    int year2 = getNextLeapYear(year);
    int year3 = getNextLeapYear(year2);
    int year4 = getNextLeapYear(year3);
    int year5 = getNextLeapYear(year4);

    System.out.println(year2);
    System.out.println(year3);
    System.out.println(year4);
    System.out.println(year5);
  }

}
