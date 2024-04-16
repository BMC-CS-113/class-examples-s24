import java.lang.ArithmeticException;


public class TruthTables {

    public static boolean div(int a, int b) {
        try {
            int x = a / b;
            return x % 2 == 0;
        } catch (ArithmeticException e) {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean a = div(100, 5); //true
        boolean b = div(10, 0); //false
        boolean c = div(7, 2); //false

        System.out.println(a || b); //T || F => true
        System.out.println(!a && b); //F && F => false
        System.out.println(a || (a && b) || !b || c); //T || (T && F) || T || F => T
        System.out.println(a && !a); //T && F => F
        System.out.println(b || !a); //F || F => F
        System.out.println(c && c || a); //F && F || T => F || T => T
                        /* F && F || T 
                         *    F   || T 
                         *        T
                         */
    }
}
