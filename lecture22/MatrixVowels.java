public class MatrixVowels {

    public static boolean areVowels(char[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (!(arr[i][j] == 'a' || arr[i][j] == 'e' || arr[i][j] == 'i' ||
                        arr[i][j] == 'o' || arr[i][j] == 'u')) {
                //if (arr[i][j] != 'a' && arr[i][j] != 'e' && .....)

                    return false;
                }

            }
        }
       return true; 
    }

    public static void main(String[] args) {
        char[][] arr1 = {{'a', 'e', 'e'}, {'e', 'a', 'o'}, {'i', 'o', 'u'}};
        char[][] arr2 = {{'c', 'e', 'f'}, {'h', 'z', 'o'}, {'i', 'o', 'm'}};

        System.out.println(areVowels(arr1));
        System.out.println(areVowels(arr2));
    }

}
