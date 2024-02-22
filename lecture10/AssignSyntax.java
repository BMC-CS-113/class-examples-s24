public class AssignSyntax {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        int product = 0;
        int divisor = 100;
        int message = "";

        //equivalent ...
        sum = sum + 1;  
        idx = idx + 1;

        sum += 1;
        idx += 1;

        product = product * 2;
        product *= 2;

        divisor = divisor / 2;
        divisor /= 2;

        message = message + “lol!”;
        message += "lol!";


    }

}
