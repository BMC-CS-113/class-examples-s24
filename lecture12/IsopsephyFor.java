public class IsopsephyFor {

    //declare a method names iso that takes a String and returns an int  
    public static int iso(String str) {
        // make a for loop to loop over all the characters in the string

        "ab"
        sum = 0;
        i = 0;
        str.length() = 2

        ======
        curChar = 'a'
        sum = 1
        ======
        i = 1;
        curChar = 'b'
        sum = 3
        ======
        i = 2;

        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            char curChar = str.charAt(i); 
            sum += curChar-'a'+1; 
            //sum = sum + ...
        }

        return sum;
        
        // 1. Need to declare a variable to track the sum.
        //     int sum = 0;     
        // 2. Where should the itr value start
        //      
        // 3. When should I stop? 
        // 4. How do I get a particular character from a string?
        // 6. How do I get the numeric value of a letter?

    }

    public static void main(String[] args) {
        //call the method with "abcd" (1 + 2 + 3 + 4)
        //call the method with "efgh" (5 + 6 + 7 + 8)
    }
}
