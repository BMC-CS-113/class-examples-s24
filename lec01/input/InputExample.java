import java.util.Scanner;
import java.io.*;

public class InputExample {

  public static void main(String[] args) {
    //TODO 0: A scanner is a class to access and read data input.
    //https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

    //TODO 1: What is System.in?
  try {
    Scanner input = new Scanner(new File("hi.txt")); 
  } catch (FileNotFoundException e) {
    System.out.println("no file");
}

    System.out.print("Enter your age in years: ");

    //There's many "next" methods you can see in the javadocs.
    int age = input.nextInt(); 
    System.out.println("Your birthyear is: " + (2024-age));
  }


  //TODO 2: What does this code do? [let's run it and see if youre right!]
  //TODO 3: What if we wanted to read from a file? (You'll do this in lab)
  //TODO 4: Edge cases? 

}
