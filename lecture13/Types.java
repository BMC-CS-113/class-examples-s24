public class Types {

    public static boolean foo(int x) {
        return true;
    }

    public static void main(String[] args) {
        //Which of these lines causes a type error and why?
        int x = 15;
        char c = "h";
        boolean b = foo(x);
        double d = 5.5;
        x = 15 + d;

        double y = 0;

        if (y)  {
            int z = foo(100);
        }

        if (b) {
            y = x;
        }

        String[] arr = {'a', 'b', 'c'};
        int[] arr2 = {0, 0, 0};

        arr2[b] = 5;
    }

}
