public class MilesToKm {
  public static void main(String[] args) {
    String input = System.console().readLine();
    double miles = Double.parseDouble(input);
    double km = miles * 1.6;

    System.out.println(miles + " miles is " + km + " kilometers");
  }

}
