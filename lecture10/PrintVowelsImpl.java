public class PrintVowelsImpl {

    public static void printVowels(String str) {
        //Base case?
        if (str.length() == 0) {
            System.out.println();
            return;
        }


        //let's use a switch statement!
        char first = str.charAt(0);
        
        switch (first) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println(first);
            default:
                break;

        //what if the words have capital letters?
        }
        printVowels(str.substring(1));
    }



    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "cinnabon";
        String s3 = "cApitAlIzatiOn";
        printVowels(s1.toLowerCase());
        printVowels(s2.toLowerCase());
        printVowels(s3.toLowerCase());
    } 

}
