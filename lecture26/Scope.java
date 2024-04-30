public class Scope {
    public static int divide(int x, int y) {
        System.out.println("div " + x);
        return x / y;
    }

    public static int compute(int x, int y) {
        System.out.println("compute " + x);
        return x * y;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        try {
            int z = divide(y, 0);
            x = z;
        } catch (Exception e) {
            int z = 20;
            y = z; //y = 20, x=5
            try {
                x = compute(x, y); //x = 100
            } catch (Exception ex) {
                y = x;
            }
        }
        System.out.println("x: " + x); //100
        System.out.println("y: " + y); //20
    }
}
