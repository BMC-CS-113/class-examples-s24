public class IndexOf {

    public static int indexOf(String haystack, String needle) {
        if (haystack.length() == 1) {
            return 0;
        }

        if (haystack.substring(0,1).equals(needle)) {
            return 0;
        } 

        return 1 + indexOf(haystack.substring(1), needle);
        //return indexOf(haystack.substring(1), needle);
    }


    public static void main(String[] args) {

        System.out.println(indexOf("Apple", "A"));
        System.out.println(indexOf("Apple", "l"));
        System.out.println(indexOf("Apple", "e"));
    }

}
