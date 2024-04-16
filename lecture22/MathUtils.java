public class MathUtils {
    static int a = 100;

    //create a static factorial method
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
