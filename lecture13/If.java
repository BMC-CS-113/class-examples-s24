public class If {

    public static void main(String[] args) {


        int x = 0;
        int y = 100;
        int z = -1;

        if (x > 0) {
                System.out.println("bar");
        } else {
            if (y < 0) {
                System.out.println("foo");
            } else if (z == 0) {
                System.out.println("baz");
            }
        }

        //TODO: write these as a single if / else if  statement
        
    }

}
