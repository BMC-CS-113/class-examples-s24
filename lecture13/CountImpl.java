public class CountImpl {
    //Write a method count which takes a String and a char 
    //and returns an int indicating how many times the character appears in the String

    /*
    public static int count(String s, char c) {
        if (s.length() == 0) {
            return 0;
        }

        if (c == s.charAt(0)) {
            return  1 + count(s.substring(1), c);
        } else {
            return count(s.substring(1), c);
        }

    }
    */

    public static int count(String s, char c)  {

        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                count += 1;
            }
        }
        return count;
    }

    //TODO 1: write it recursively
    //TODO 2: write it with a loop

    public static void main(String[] args) {
        int x = count("Hello!", 'e');
        System.out.println(x); //1
        
        x = count("yep", 'z');
        System.out.println(x); //0

        x = count("eee", 'e');
        System.out.println(x); //3
    }
    
    

}
