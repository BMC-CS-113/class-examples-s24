public class Chars {

    public static int countWord(String word) {
        //sum of the alphabetical indices of each character
        //"abc" => 1 + 2 + 3 = 6
        //"aaa" => 1 + 1 + 1 = 3
        //"a"
        //
        String l = word.toLowerCase();
        int sum = 0;
        for (int i=0; i<word.length(); i++) {
            sum +=  word.charAt(i) - 96;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countWord("abc"));
    }
}
