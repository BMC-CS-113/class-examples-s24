public class Parse {

  //What does this code do?
  public static void main(String[] args) {

    String s = ",";
    String[] tokens = s.split(",");

    for (int i=0; i<tokens.length;i++) {
      System.out.println(tokens[i]);
    }

  }

}
