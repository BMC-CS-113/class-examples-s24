public class GuessAgeImpl {
  public static int getLastTwoDigits(int num)  {
    String snum = ((Integer) num).toString();
    return Integer.parseInt(snum.substring(2));
  }

  public static int getBirthYear() {
      System.out.println("Enter your birth year");
      int year = Integer.parseInt(System.console().readLine());
      return year;
  }

  public static int guessAge(int inputNum) {
    int result = inputNum * 2;
    int added = result + 1766;
    int birthYear = getBirthYear();
    int subbed = added - birthYear;
    return getLastTwoDigits(subbed); 
  }

  /*
    Write a method to “guess” a user’s age
    Ask the user to enter a number between 1 and 10
    Multiply that number by 2
    Add 1766
    Ask what year the user was born (helper function)
    Subtract the year they were born
    Return the last two digits in your result.. that is the age
  */
  public static void main(String[] args) {
    System.out.println("Pick a number between 2 and 10");
    int num = Integer.parseInt(System.console().readLine());

    int age = guessAge(num);
    System.out.printf("Is your age %d?", age);
  }


}
