public class CanSpell{


    //Write a method canSpell which takes 2 strings (letters and word) 
    // and returns a boolean if the word can be spelled with the letters.
    public static boolean canSpell(String letters, String word) {

        for (int i=0; i<word.length(); i++) {
            char l = word.charAt(i);

            boolean found = false;
            //check if l is in letters

            for (int j=0; j<letters.length(); j++) {
                char l2 = letters.charAt(j);

                if (l == l2) {
                    found = true;
                    break;
                }
            }

            if (!found) {
               return false; 
            }
        }

        //draw general strategy on the board with our examples
        //1. loop over each character in the word
        //2. loop over each character in letters to check against the char in word
        //3. Record if it's found
        //4. return false if that character wasn't found
    }

    public static void main(String[] args) {
        //call canSpell
        System.out.println(canSpell("rac", "car")); //true
        System.out.println(canSpell("ehnop", "phone")); //true
        System.out.println(canSpell("an", "anna")); //true
        System.out.println(canSpell("zha", "hat")); //false
        
    }
}
