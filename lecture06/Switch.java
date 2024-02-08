public class Switch {
    public static void main(String[] args) {
        int x = 100;

        switch (x) { //value we're comparing against
            case 1:
                System.out.println("x is small");
                break;
            case 100:
                System.out.println("x is large");
                break;
            default:
                System.out.println("x is medium");
        }

        if (x == 1) {
            //print x is small
        } else if (x == 100) {
            //print x is large
        } else { 
            //print x is medium
        }
    }
}
