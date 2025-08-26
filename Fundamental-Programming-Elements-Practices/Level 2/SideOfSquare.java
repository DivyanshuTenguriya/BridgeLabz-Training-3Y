import java.util.*;
public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float perimeter=sc.nextFloat();
        float side =perimeter/4f;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}
