public class Equals {

  public static void main(String[] args) {

    //Comparing Primitives
    int x = 0;
    double y = 0;

    System.out.println("x == y? " + (x == y));

    //Comparing References (Objects)
    String s1 = new String("Hello");
    String s2 = new String("hello");
    String s3 = new String("Hello");

    System.out.println("s1 == s2? " + (s1 == s2));
    System.out.println("s1 == s3? " + (s1 == s3));

    System.out.println("s1 == s3? " + s1.equals(s3));
        
  }

}
