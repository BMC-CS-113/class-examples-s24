public class PerimSum {


    public static void main(String[] args) {
        //What is the size of this array?
        int[][] matrix = {
            {1,  2,  3,  4,  5,  2, 2},
            {6,  7,  8,  9,  10, 3, 6},
            {11, 12, 13, 14, 15, 1, 6},
            {16, 17, 18, 19, 20, 9, 8},
        };

        int sum = 0;
        //loop over the matrix
        //if in a perimiter position... add to sum
        for (int r=0; r<matrix.length; r++) {
            for (int c=0; c<matrix[r].length; c++) {

                boolean isOuterRow = r == 0 || r == matrix.length-1;
                boolean isOuterCol = c == 0 || c == matrix[r].length-1;

                if (isOuterRow || isOuterCol) {
                    sum += matrix[r][c];
                } 
            }
        }

        System.out.println(sum); //155

    }

}
