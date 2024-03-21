public class FillImpl {

    public static void printArray(int[][] toPrint) {
        for (int i=0; i<toPrint.length; i++) {
            for (int j=0; j<toPrint[i].length; j++) {
                System.out.print(toPrint[i][j] + " ");
            }

            System.out.println();
        }
    }

    //3. Create a method that takes two ints (row and col) and an int[][] and fills that position with the number 100 
    public static void fill(int r, int c, int[][] arr) {
        arr[r][c] = 100;
    }

    public static void main(String[] args) {
        int[][] toFill = new int[5][5];
        fill(toFill, 0, 1);
        printArray(toFill); //1. should this print?

        int[][] toFill2 = new int[3][3];
        fill(toFill2, 0, 0);
        fill(toFill2, 1, 1);
        fill(toFill2, 2, 2);
        printArray(toFill2); //2. what should this print?

    }
}
