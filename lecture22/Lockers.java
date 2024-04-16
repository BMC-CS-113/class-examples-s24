public class Lockers {

    //initialize the locker system with a given number of rows and cols, 
    //filling it with default values indicating empty lockers 
    //(e.g., 'O' for empty and 'X' for occupied).
    public static char[][] init(int rows, int cols) {
       char[][] lockers = new char[rows][cols]; 

       for (int i=0; i<rows; i++) {
           for (int j=0; j<cols; j++) {
                lockers[i][j] = 'O';
           }
       }
    
       return lockers;
    }

    //change the occupancy status of a specific locker (i.e., mark it as occupied or empty). 
    public static void setLocker(char[][] lockers, int row, int col) {
        if (lockers[row][col] == 'O') {
            lockers[row][col] = 'X';
        } else {
            lockers[row][col] = 'O';
        }
    }


    //check the occupancy status of a specific locker.
    public static boolean isOccupied(char[][] lockers, int row, int col) {
        return lockers[row][col] == 'X';
    }

    //display the current state of the locker system, showing which lockers are occupied and which are empty.
    public static void display(char[][] lockers) {
        for (int i=0; i<lockers.length; i++) {
               for (int j=0; j<lockers[i].length; j++) {
                    System.out.print(lockers[i][j] + " ");
               }
               System.out.println();
           }
    }


    public static void main(String[] args) {
        //test your locker system
        char[][] l = init(7, 12);
        setLocker(l, 0, 0);
        setLocker(l, 0, 1);
        setLocker(l, 1, 1);

        System.out.println(isOccupied(l, 0, 0));
        System.out.println(isOccupied(l, 2, 2));

        display(l);

    }

}
