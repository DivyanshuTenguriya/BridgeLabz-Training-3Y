import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Principal=scn.nextInt();
        int Rate=scn.nextInt();
        int Time=scn.nextInt();
       float Interest = (Principal * Rate * Time) / 100;
        System.out.println(Interest);}
}
