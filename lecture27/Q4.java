class Q4 {
    public static int uniqueElems(int[] a) {
        int max = a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        boolean[] seen = new boolean[max+1];
        //[1, 2, 3, 3]
        int count = 0;

        for (int i=0; i<a.length; i++) {
            if (seen[a[i]] == true) {
                //dup
            } else {
                seen[a[i]] = true; 
                count += 1;
            }
        }

        /*
        boolean dup = false;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    dup = true;
                    //DUPLICATE
                }
            }

            if (!dup) {
                count += 1;
            }
        }
        */
        return count;
    }


    public static void main(String[] args) {
        int[] ex1 =  new int[]{1, 2, 3, 3};
        int[] ex2 = new int[]{9, 10, 9, 10, 0, 1, 2};

        System.out.println(uniqueElems(ex1)); //3
        System.out.println(uniqueElems(ex2)); //5
    }
}
