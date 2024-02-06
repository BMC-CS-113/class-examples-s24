public class Scope2 {

  public int increment(int myNum) {
    myNum = myNum + 1;
    return myNum;
  }

  public int addNumsPlusOne(int a, int b) {
    int aInc = increment(a); 
    //TODO 1: what is the value of a here?
    System.out.println(a);

    int bInc = increment(b);
    return aInc + bInc;
  }

  public static void main(String[] args) {
    int num1 = 15;
    int num2 = 20;
    int num3 = addNumsPlusOne(num1, num2);




    //TODO 2:
    //what is the value of num1 here?
    //what is the value of a here?
    //what is the value of myNum here?
  }

}
