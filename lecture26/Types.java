public class Types {

    public static boolean foo(int x) {
        return true;
    }

    public static void main(String[] args) {
        //Which of these lines causes a type error and why
        int x = 15;
        //char c = "h"; //type error.. chars should have single quotes
        boolean b = foo(x);
        double d = 5.5; 
        x = 15 + (int)d; 
        System.out.println(x); //What will this print?

        double y = 0;

        /*
        if (y) { //conditional must be a boolean
            int z = foo(100); //foo is boolean returning
        }
        */

        if (b) { 
            y = x; 
        }

        //String[] arr = {'a', 'b', 'c'}; //Strings have double quotes
        int[] arr2 = {0, 0, 0};

        //arr2[b] = 5;  //array indices must be non-negative INTS

        //int c = d + 3.7; //lossy conversion

        String f = "Hello!";

        int z = 97 + f.charAt(3); 
        //int z = 'a' - 91;
    }

}
