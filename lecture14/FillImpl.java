public class FillImpl {

    public static void printArray(int[][] toPrint) {
        for (int i=0; i<toPrint.length; i++) {
            for (int j=0; j<toPrint[i].length; j++) {
                System.out.print(toPrint[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void fill(int[][] toFill, int row, int col) {
        toFill[row][col] = 100;        
    }

    public static void main(String[] args) {
        int[][] toFill = new int[5][5];
        fill(toFill, 0, 1);
        printArray(toFill);

        int[][] toFill2 = new int[3][3];
        fill(toFill2, 0, 0);
        fill(toFill2, 1, 1);
        fill(toFill2, 2, 2);
        printArray(toFill2);

    }
}
