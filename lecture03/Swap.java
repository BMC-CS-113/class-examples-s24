public class Swap {

  public static void main(String[] args) {
    System.out.println("enter a number");

    //kinds of types
    //double, int, String
    String num1; //no value is in num1 ""
    num1 = System.console().readLine();

    System.out.println("enter a second number");
    String num2 = System.console().readLine();

    System.out.println("before swap " + num1 + " " + num2);
    /* num1    num2    tmp
     * -------------------
     * 15     100      100
     */     

    String tmp = num1;
    num1 = num2;
    num2 = tmp;

    //swap
    System.out.println("after swap " + num1 + " " + num2);

  }
}
