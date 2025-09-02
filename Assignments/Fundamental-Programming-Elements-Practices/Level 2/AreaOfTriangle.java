import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float base_in_inches=base/2.54f;
        float height_in_inches=height/2.54f;
        System.out.println("Your area of triangle in cm is "+(0.5f*base*height)+" and in inches is "+(0.5f*base_in_inches*height_in_inches));
    }
}