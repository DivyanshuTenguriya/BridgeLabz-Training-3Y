import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        int exponent=scn.nextInt();
        double result=Math.pow( exponent, base);
        System.out.println(result);
    }
}
