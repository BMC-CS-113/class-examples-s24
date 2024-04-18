public class Piano extends Instrument {

    //Create a subclass: Piano overriding the play() method to print  "Playing a piano"

    public void play() {
        System.out.println("Playing a piano");
    }


    public static void main(String[] args) {

        /* In the main() method of your program, create an array of Instrument objects 
         * containing instances of both Guitar and Piano. 
         * Iterate through the array and call the play() method for each object. 
         */

        Instrument[] insts = new Instrument[3];
        insts[0] = new Instrument();
        insts[1] = new Piano();
        insts[2] = new Guitar();

        for (int i=0; i<insts.length; i++) {
                insts[i].play();
        }
    }
}
