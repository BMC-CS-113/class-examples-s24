public class IsopsephyWhile {

    //declare a method names iso that takes a String and returns an int  
    public static int iso(String str) {
        // make a while loop to loop over all the characters in the string
        int idx = 0;
        int sum = 0;
        //stop when idx == str.length()-1
        while (idx < str.length()) {
            char curChar = str.charAt(idx);
            sum += curChar -'a' + 1;

            idx += 1;
        }

        return sum;
        
        // 1. I need a variable to track iteration.. how do I declare one?
        // 2. When should I stop? 
        // 3. How do I get a particular character from a string?
        // 4. How do I get the numeric value of a letter?

    }

    public static void main(String[] args) {
        int val = iso("abcd");
        System.out.println(val);
        //call the method with "abcd" (1 + 2 + 3 + 4)
        //call the method with "efgh" (5 + 6 + 7 + 8)
    }
}
