import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int radius=scn.nextInt();
        double Area=3.14*radius*radius;
        System.out.println(Area);
    }
}
