public class BlastOff{

    public static void blastOff(int x) {
        //while loop to count down from x to 0
        while (x >= 0) {
            System.out.println(x);
            //x = x - 1;
            x -= 1;
            //x--;
        } 
        System.out.println("Blast off!");
        
    }

    public static void main(String[] args) {
        blastOff(3);
        blastOff(-5); //what would print?
    }
}
