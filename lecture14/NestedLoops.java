public class NestedLoops {

    public static void main(String[] args) {
        // What will be printed?

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(i + ", " + j + " ");
            }

            System.out.println();  
        }
    }

}
