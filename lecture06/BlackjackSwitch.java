import java.util.Random;

public class BlackjackSwitch{


  public static void main(String[] args) {
    Random randomNumGenerator = new Random();

    int nc = randomNumGenerator.nextInt(22);
    //System.out.println(randInt);
    if (nc < 2) {
      return;
    }

    switch (nc) {
        case 21: //if nc == 21
            System.out.println("blackjack");
            break;
        case 17:  //if nc == 17
        case 18:
        case 19:
        case 20:
            System.out.println("stand");
            break;
        default:
            System.out.println("hit me!");
            break;
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
