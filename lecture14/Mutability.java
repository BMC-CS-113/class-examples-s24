public class Mutability {

    public static int getAddr(Object o) {
        return System.identityHashCode(o);
    }

    public static void main(String[] args) {
        String s = "Hello world!";
        System.out.println("Before replacement @" + getAddr(s));
        
        //s[0] = 'Y'; //REMINDER: strings are char arrays
        s = s.replace("H", "Y");

        System.out.println("After replacement @" + getAddr(s));

        Integer i = 15;

        System.out.println("\nBefore replacement @" + getAddr(i));
        i = 100;
        i += 1;

        System.out.println("After replacement @" + getAddr(i));

    }
}
