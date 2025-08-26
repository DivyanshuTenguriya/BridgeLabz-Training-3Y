import java.util.*;
public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double distanceInFeets=sc.nextDouble();
        double distanceInYards=distanceInFeets/3d;
        double distanceInMiles=distanceInYards/1760d;
        System.out.println("Your Height in feet is "+distanceInFeets+" while in Yards is "+distanceInYards+" and miles is "+distanceInMiles);
    }
}
