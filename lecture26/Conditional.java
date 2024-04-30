public class Conditional{
    public static void main(String[] args) {
        int x = 5; 
        int y = 10;
        boolean a = x < 0;  //false
        boolean b = y > 0;  //true
        
        if (!a && b) { //!a => true && true => true
            if (x % 2 == 0) { //5 % 2 = 1
                if (y != 10) {
                    if (x > 0 && y < 20) {
                        System.out.println("Cat");
                    } else if (x == 5 || y == 10) {
                        System.out.println("Dog");
                    } else {
                        System.out.println("Something else");
                    }
                } else {
                    System.out.println("Hello");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Some other condition");
        }
    }
}

