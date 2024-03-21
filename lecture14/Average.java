public class Average {


    public static void main(String[] args) {
        //What is the size of this array?
        int[][] matrix = {
            {11, 12, 13, 1, 6},
            {16, 17, 18, 9, 8}
        };

        int sum = 0;
        int total = 0;
        //loop over the matrix

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                sum += matrix[i][j];
                total += 1;
            }
        }

        //int total = (matrix.length)*(matrix[0].length)
        double average = (double) sum / (double)total;
        System.out.println(average); //11.1

    }

}
