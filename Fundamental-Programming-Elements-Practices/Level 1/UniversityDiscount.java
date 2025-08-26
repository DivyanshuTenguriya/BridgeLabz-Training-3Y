import java.util.*;
public class UniversityDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fee=sc.nextDouble();
        double discount=sc.nextDouble();
        double discount_amount=fee*(discount/100d);
        double discounted_fee=fee-discount_amount;
        System.out.println("The discount amount is INR "+discount_amount+" and final discounted fee is INR "+discounted_fee);
    }
}
