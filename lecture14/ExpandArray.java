public class ExpandArray {

    public static void main(String[] args) {

        //1. create a new array (your choice of  how to initialize)
        //2. fill it with values
        int[] oldAccounts = {100, 4, 50000, -2.5};

        //3. create a new array
        int[] newAccounts = new int[50];
        //4. copy over all elements 

        for (int i=0; i<oldAccounts.length; i++) {
            newAccounts[i] = oldAccounts[i];
        }
    }
}
