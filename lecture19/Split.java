public class Split {
    public static void main(String[] args) {
        String x = "hi,15,yellow,philly";

        String[] values = x.split(",");

        //What will these print?
        System.out.println(values[0]); //hi
        System.out.println(values[1]); //15
        System.out.println(values[2]); //yellow
        System.out.println(values[3]); 
    }


}
