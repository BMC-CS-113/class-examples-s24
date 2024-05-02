public class Q1Loop {

    public static int numOccurs(int[] a, int[] b) {
        int count = 0;

        for (int ia=0; ia<a.length; ia++) {
            for (int ib=0; ib<b.length; ib++) {
                if (a[ia] == b[ib]) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        assert numOccurs(new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6}) == 3;
        assert numOccurs(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7}) == 0;
        assert numOccurs(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, new int[]{3}) == 3;
    }

}
