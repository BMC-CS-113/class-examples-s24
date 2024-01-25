public class Ask {

  public static void main(String[] args) {
    System.out.println("What's your name?");
    String output = System.console().readLine();
    System.out.println("How are you doing," + output + "?");
    int age = 15; 
    System.out.println("Hey, " + output + " you are " + age + " years old");

  }

}
