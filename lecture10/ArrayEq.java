public class ArrayEq {
    public static void main(String[] args) {
        int[] x = {1,1,1};
        int[] y = {2,1,1};

        //System.out.println(x == y); //what will this print?
        //System.out.println(x);

        //ASSUME X AND Y ARE THE SAME SIZE
        boolean isEqual; //false

        int idx = 0;
        while (idx < x.length) {
            isEqual = x[idx] == y[idx]; 

            if (!isEqual) {
                break;
            }

            idx = idx + 1;  //idx = 1
        }

        //isEqual is true if all elements are equal
        //              otherwise false


        /*
        System.out.println(x[0] == y[0] && x[1] == y[1] && x[2] == y[2]);

        if (x[0] == y[0] && x[1] == y[1] && x[2] == y[2]) {
           System.out.println("eq");
        }
        */

    }
}
