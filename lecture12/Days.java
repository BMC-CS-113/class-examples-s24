public class Days {

    public static void main(String[] args) {

        //for each week (1-3)
        for (int i=1; i<=3; i++) {
            System.out.printf("Week %d:\n", i);

            for (int j=0; j<7; j++) {
                
               if ((j+1) % 2 == 0)  {
                    System.out.printf("    Day %d\n", j+1);
               }

            }
        }
            //print
            //for each day (1-7)
                //check if even and print if so
    }

}
