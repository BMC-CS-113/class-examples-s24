public class ContainsLetterImpl {

    //TODO: recursive method here
    public static boolean containsLetter(String letter, String word) {
        if (word.length() == 0) {
            return false;
        }

        if (word.substring(0,1).equals(letter)) {
            return true;
        }

        return containsLetter(letter, word.substring(1));
    }


    public static void main(String[] args) {

        System.out.println(containsLetter("A", "Apple"));
        System.out.println(containsLetter("l", "Apple"));
        System.out.println(containsLetter("e", "Apple"));
        System.out.println(containsLetter("a", "dog"));
    }

}
