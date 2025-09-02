import java.util.*;
public class PrecedenceCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Answer of a+b*c = "+(a+b*c));
        System.out.println("Answer of a*b+c = "+(a*b+c));
        System.out.println("Answer of c+a/b = "+(c+a/b));
        System.out.println("Answer of a%b+c = "+(a%b+c));
    }
}
