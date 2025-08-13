import java.util.Scanner;

public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int Kilometers=scn.nextInt();
        double Miles = Kilometers * 0.621371;
        System.out.print(Miles);
    }

}
