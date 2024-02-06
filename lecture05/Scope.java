public class Scope {

  public static int addNums(int a, int b) {
    System.out.println("num1"); 
    //System.out.println(num1); //out of scope
    return a + b;
  }

  public static void main(String[] args) {
    int num1 = 15;
    int num2 = 20;
    int num3 = addNums(num1, num2);

    System.out.println(num1);//15
    //System.out.println(a); //out of scope
  }

}
