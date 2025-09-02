import java.util.Scanner;

public class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int average=(a+b+c)/3;
        System.out.println(average);

    }
}
