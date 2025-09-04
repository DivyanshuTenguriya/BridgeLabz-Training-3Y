import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheNumberWithArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int maxDigit=1;
        int index=0;
        int count=0;
        int[] reverseDigits=new int[maxDigit];
        while(number>0){
            if(index == maxDigit){
                maxDigit*=2;
                int[] newarr=new int[maxDigit];
                for(int i=0;i<index;i++){
                    newarr[i]=reverseDigits[i];
                }
                reverseDigits=newarr;
            }
            int digit=number%10;
            reverseDigits[index]=digit;
            index++;
            number/=10;
            count++;
        }
        int[] original=new int[count];
        for(int i=0;i<count;i++){
            original[i]=reverseDigits[i];
        }
        System.out.println(Arrays.toString(original));
    }
}
