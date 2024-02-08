import java.util.Scanner;

public class IsEven {

  public static boolean isEven(int num) {
      return num % 2 == 0;
  }


  public static void main(String[] args) {
      System.out.println("enter a number");
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt();

      boolean myNumberIsEven = isEven(num);
      System.out.println(myNumberIsEven);

      if (myNumberIsEven)  {
        System.out.printf("%d is even\n", num);
      } else {
        System.out.printf("%d is odd\n", num);
      }
  }
}
