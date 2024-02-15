public class Factorial {

    //precondition: num must be positive
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        int f3 = factorial(3);
        System.out.println(f3);
    }
}
