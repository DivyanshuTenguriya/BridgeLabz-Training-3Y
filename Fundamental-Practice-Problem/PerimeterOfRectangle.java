import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int width=scn.nextInt();
        int Perimeter=2*(length+width);
        System.out.println(Perimeter);
    }
}
