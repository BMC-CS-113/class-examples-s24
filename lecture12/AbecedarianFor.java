public class AbecedarianFor {

    //declare a method names isAlphaOrder that takes a String and returns a boolean  

    public static boolean isAlphaOrder(String str) {
        // make a for loop to loop over all the characters in the string

        for (int i=0; i < str.length()-1; i++) {
            char curChar = str.charAt(i);
            char nextChar = str.charAt(i+1);

            if(curChar > nextChar) {
                return false;
            }

        }
        
        return true;
        // 1. What value should the itr start at?
        // 2. When should I stop? Stop when i == str.length()-1
        // 3. How do I get a particular character from a string?
        // 4. How do I compare two characters alphabetically?

    }

    public static void main(String[] args) {
        String s = "abdest";
        boolean name = isAlphaOrder(s);
        System.out.printf("%s is in alphabetical order: %b \n", s, name);
        //print "abdest" is in alphabetical order: True/False

        //call the method with "abdest"
        //call the method with "dimpsy"
        //call the method with "zyxw"
    }
}
