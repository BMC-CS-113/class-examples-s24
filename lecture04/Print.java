public class Print {

  public static void p1(String x) {
    System.out.printf("Your number %s", x);
  }

  public static String p2(String x) {
    return "Your number " +  x;
  }

  public static void main(String[] args) {
    //String myNum = p1("7"); //WILL NOT COMPILE. TYPE MISMATCH
    String myNum2 = p2("5");
  }

}
