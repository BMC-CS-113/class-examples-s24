import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    System.out.print("If your major is CS, enter a 1: ");
    
    //1. create a scanner 
    Scanner sc = new Scanner(System.in);
    //2. read in an int.
    int input = sc.nextInt();

    /*
    boolean a = true;
    boolean b = false;
    */

    boolean isAcsStudent = input == 1;

    int x = 10;
    int y = 10; 

    if (y == x || x > 5) {
      System.out.println("nice! My username is edinella");
    }

  }
}
