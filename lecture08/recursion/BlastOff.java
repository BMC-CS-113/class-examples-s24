public class BlastOff {

    public static void blastOff(int n) {
        if (n == 0) {
            System.out.println("Blast off!");
            return;
        }

        System.out.println(n);
        blastOff(n-1);
    }

    public static void main(String[] args) {
        blastOff(5);
    }
}
