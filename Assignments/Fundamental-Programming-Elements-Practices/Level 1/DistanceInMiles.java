import java.util.*;
public class DistanceInMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float distanceInKilometers=sc.nextFloat();
        float distanceInMiles=distanceInKilometers/1.6f;
        System.out.println("The total miles is "+distanceInMiles+" mile for the given "+distanceInKilometers+" km");
    }
}
