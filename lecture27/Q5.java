public class Q5 {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("data2.txt"));

        //int maxLine1 = 0;
        //int maxLine2 = 0;
        //while (sc.hasNextLine()) {
            String line1 = sc.nextLine();

            String[] nums = line.split(" ");
            int maxLine1 = Integer.parseInt(nums[0]);

            for (int i=0; i<nums.length; i++) {
                if (Integer.parseInt(nums[i]) > maxX) {
                    maxLine1 = Integer.parseInt(nums[i]);
                }
            }
            //
            String line2 = sc.nextLine();

            String[] nums = line.split(" ");
            int maxLine2 = Integer.parseInt(nums[0]);

            for (int i=0; i<nums.length; i++) {
                if (Integer.parseInt(nums[i]) > maxX) {
                    maxLine2 = Integer.parseInt(nums[i]);
                }
            }

        //}

        int[] arr = new int[maxLine1][maxLine2];
    }
}
