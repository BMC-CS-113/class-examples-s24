public class StringFormatting {
  public static void main(String[] args) {
    //TODO 1: read in name from the user 
    String name = System.console().readLine();
    //
    //TODO 2: read in age from the user

    int age = Integer.parseInt(System.console().readLine());

    //TODO 3: print!
    //System.out.println("My name is " +  name + " and I am " + age + " years old.");
    System.out.printf("My name is %s and I am %d years old.\n", name, age);

  }
}
