import java.util.Scanner;

public class FrequencyOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long number=sc.nextLong();
        int max=0;
        long temp=number;
        while(temp>0){
            int d=(int)(temp%10);
            if(d>max){
                max=d;
            }
            temp/=10;
        }
        int[] digits=new int[max+1];
        while(number>0){
            int d=(int)(number%10);
            digits[d]++;
            number/=10;
        }
        System.out.println("Digit   Frequency");
        for(int i=0;i<=max;i++){
            System.out.println("  "+i+"         "+digits[i]);
        }
    }
}
