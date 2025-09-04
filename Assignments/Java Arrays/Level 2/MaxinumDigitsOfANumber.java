import java.util.Scanner;

public class MaxinumDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int maxDigit=10;
        int index=0;
        int[] digits=new int[maxDigit];
        while(number>0){
            if(index==maxDigit){
                maxDigit*=2;
                int[] newarr=new int[maxDigit];
                for(int i=0;i<index;i++){
                    newarr[i]=digits[i];
                }
                digits=newarr;
            }
            int digit=number%10;
            digits[index]=digit;
            index++;
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
            else if(d>secondLargest && d!=largest){
                secondLargest=d;
            }
        }
        System.out.println("Largest digit is "+largest);
        System.out.println("The second largest number is "+secondLargest);
    }
}
