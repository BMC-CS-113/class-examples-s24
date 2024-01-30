public class LeapYears {

  public static void main(String[] args) {
    System.out.println("Enter a year");
    String inputYearStr = System.console().readLine();

    int inputYear = Integer.parseInt(inputYearStr);

    int inputYear2 = inputYear + 4;
    int inputYear3 = inputYear2 + 4;
    int inputYear4 = inputYear3 + 4;
    int inputYear5 = inputYear4 + 4;

    System.out.println("the next four leap years are: ");
    System.out.println(inputYear2 + " " + inputYear3 + " " + inputYear4 + " " + inputYear5);

  }

}
