public class BoolNegImpl {
    
    public static boolean[] boolNeg(boolean[] array) {
        // Create a new array to store the negated values
        boolean[] negatedArray = new boolean[array.length];

        // Call the recursive helper method to negate each element in the array
        boolNeg(array, negatedArray, 0);

        // Return the negated array
        return negatedArray;
    }

    private static void boolNeg(boolean[] originalArray, boolean[] negatedArray, int index) {
        // Base case?
        if (index == originalArray.length) {
            return;
        }

        // Negate and store it in the new array
        negatedArray[index] = !originalArray[index];

        // Recursively call the method for the next index
        boolNeg(originalArray, negatedArray, index + 1);
    }

    public static void main(String[] args) {
        boolean[] bArr = {true, false, true, true, false};
        boolNeg(bArr);
    }

}
