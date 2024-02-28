public class AbecedarianWhile {

    //declare a method names isAlphaOrder that takes a String and returns a boolean  
    public static boolean isAlphaOrder(String str) {
        // make a while loop to loop over all the characters in the string
        
        int index = 0;
        //Stop when i've looked at all the characters
        //index == str.length()
        while (index < str.length()-1) {
            //do something
            char curChar = str.charAt(index);
            char nextChar = str.charAt(index+1);

            if(curChar <= nextChar) {
                System.out.println("still in alpha order! " + curChar + " " + nextChar);
                    //curChar comes BEFORE or equal to nextChar in alpha order
            } else {
                return false;
            }

            index++;
            //index += 1;
        }

        return true;
        
        // 1. I need a variable to track iteration.. how do I declare one? X
        // 2. When should I stop? 
        // 3. How do I get a particular character from a string? X
        // 4. How do I compare two characters alphabetically?

    }

    public static void main(String[] args) {
        //call the method with "abdest"
        //int x = 1;
        boolean name = isAlphaOrder("abdest");
        System.out.println(name);
        //call the method with "dimpsy"
        //call the method with "zyxw"
    }
}
