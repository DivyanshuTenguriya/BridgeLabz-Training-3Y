import java.util.*;
public class PrecedenceCheckInDouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println("Answer of a+b*c = "+(a+b*c));
        System.out.println("Answer of a*b+c = "+(a*b+c));
        System.out.println("Answer of c+a/b = "+(c+a/b));
        System.out.println("Answer of a%b+c = "+(a%b+c));
    }
}
