import java.util.*;
public class ConvertInFeetsAndInches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height_in_cm=sc.nextDouble();
        double height_in_inches=height_in_cm/2.54d;
        double height_in_feets=height_in_inches/12d;
        System.out.println("Your Height in cm is "+height_in_cm+" while in feet is "+height_in_feets+" and inches is "+height_in_inches);
    }
}
