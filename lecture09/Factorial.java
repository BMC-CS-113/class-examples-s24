public class Factorial {

    //precondition: num must be positive
    public static int factorial(int num) {
       //num = 3
       if (num == 1) {
            return 1;
       } 

       // 3 * 2 * 1
       //     factorial(2)
       return num * factorial(num-1);
    }

    public static void main(String[] args) {
        int f3 = factorial(3);
        System.out.println(f3);
    }
}
