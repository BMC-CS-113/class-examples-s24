public class SwitchBroken {
    public static void main(String[] args) {
        int x = 1;

        switch (x) { //value we're comparing against
            case 1:
                System.out.println("x is small");
                //break;
            case 100:
                System.out.println("x is large");
                break;
            default:
                System.out.println("x is medium");
        }

        System.out.println("We're done");
    }
}
