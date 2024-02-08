public class CompareStrings {

  public static void main(String[] args) {
    String var1 = "Apple";
    String var2 = "Banana";
    String var3 = "!";
    String var4 = "1 apple for me!";
    String var5 = "Apple";

    //What do you think this will print? Negative, 0, or positive
    System.out.println(var1.compareTo(var2));
    System.out.println(var2.compareTo(var3)); 
    System.out.println(var3.compareTo(var1)); 
    System.out.println(var1.compareTo(var5));
  }

}
