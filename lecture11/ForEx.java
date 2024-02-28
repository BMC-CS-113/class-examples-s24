public class ForEx {

    public static void main(String[] args) {
        //write a for loop to add 100 to a variable x times
        int x = 5;
        int v = 0;

        //stop when i==x
        for (int i=0; i < x; i++) {
            v += 100;
        }

        System.out.println(v); //500
    }
}
