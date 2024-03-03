public class Count {
    //Write a method count which takes a String and a char 
    //and returns an int indicating how many times the character appears in the String

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
