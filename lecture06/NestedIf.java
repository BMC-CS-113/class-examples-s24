public class NestedIf {

  public void numVowel(char vowel) {
    if (vowel == 'a') {
      System.out.println(1);

    } else {

      if (vowel == 'e') {
        System.out.println(2);

      } else {

        if (vowel == 'i') {
          System.out.println(3);

        } else {

          if (vowel == 'o') {
            System.out.println(4);

          } else {

            if (vowel == 'u') {
              System.out.println(5);
            }

          } 
        }
      }
    }
  }
}
