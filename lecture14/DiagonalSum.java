public class DiagonalSum {


    public static void main(String[] args) {
        //What is the size of this array?
        int[][] matrix = {
            {1,   2,  3,  4,  5},
            {6,   7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        }

        int sum = 0;
        //loop over the matrix
        //if in a diagonal position... add to sum

        for (int r=0; r<matrix.length; r++) {
            for(int c=0; c<matrix[r].length; c++) {
                if (r == c) {
                    sum += matrix[r][c];
                }
            }
        }

        System.out.println(sum); // 1 + 7 + 13 + 19 + 25 = 65

    }

}
