import java.util.Random;

public class Blackjack {


  public static void main(String[] args) {
    Random randomNumGenerator = new Random();

    int nc = randomNumGenerator.nextInt(22);
    //System.out.println(randInt);
    if (nc < 2) {
      return;
    }

    if (nc == 21) {
        //print Blackjack
    } else if (nc >= 17 && nc <= 20) {
        //print stand
    } else if (nc < 17) {
        //print hit me
    }
    /*
    ALSO OK
    else {
        //print hit me 
    }
    */

  }

}
