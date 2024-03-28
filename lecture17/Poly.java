public class poly {

    public static void main(String[] args) {
        //TODO 1: fill in the constructors

        //TODO 2: Which of the following will fail to compile? (if any)

        Animal a = new Animal(100, "blue", "Mark");

        Bird b = new Bird(1, "green", "Lulu");

        Lion l = new Lion(97, "red", "Cinnabon");

        Animal a2 = new Bird(.5, "white", "regina");

        //TODO 3: What will these print?
        b.move(); //A bird flies
        l.move(); //Lions run
        a2.move(); //A bird flies
    }
}
