public class Scope2 {

    static int checkValue(int x) {
        //x = 5 
        if (x % 2 == 0) { //x % 2 = 1
            return x;
        } else {
            throw new IllegalArgumentException("Value must be even");
        }
    }


    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        try {
            if (checkValue(x) > 0) {
                x = 2 * x;
            } else {
                y = y * 2;
            }
        } catch (Exception e) {
            if (x < y) { //x = 5, y = 10
                x += y; //x = 15
            } else {
                y -= x;
            }
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

}
