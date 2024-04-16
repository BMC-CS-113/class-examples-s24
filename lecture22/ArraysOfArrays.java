public class ArraysOfArrays {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5},{2,2,1},{0,1,6}};

        /*
        a) Write a line of Java code to access and 
            print the element in the second row and third column of the matrix.
        b) Write some lines of Java code to calculate and print the 
                sum of all elements in the matrix.
        c) Write some lines of Java code to check if the element 
                at the second row and third column is equal to 6. 
                Your code should print "true" if it is and "false" otherwise.
        */

        System.out.println(matrix[1][2]); //a
        
        int sum = 0;
        for (int i=0; i<matrix.length; i++) { //i < 3 also fine for this 
            for (int j=0; j<matrix[i].length; j++) {
                sum += matrix[i][j];
            } 
        }

        System.out.println(sum); //b

        /*
        if (matrix[1][2] == 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

        System.out.println(matrix[1][2] == 6); //c

    }
}
