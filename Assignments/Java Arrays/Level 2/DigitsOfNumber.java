import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int maxDigit=10;
        int index=0;
        int[] digits=new int[maxDigit];
        while(number>0){
            int digit=number%10;
            digits[index]=digit;
            index++;
            if(index==maxDigit){
                break;
            }
            number/=10;
        }
        int largest=-1;
        int secondLargest=-1;
        for(int i=0;i<index;i++){
            int d=digits[i];
            if(d>largest){
                secondLargest=largest;
                largest=d;
            }
            else if(secondLargest<d && d!=largest){
                secondLargest=d;
            }
        }
        System.out.println("The largest digit is "+largest);
        System.out.println("The second largest digit is "+secondLargest);
    }
}
