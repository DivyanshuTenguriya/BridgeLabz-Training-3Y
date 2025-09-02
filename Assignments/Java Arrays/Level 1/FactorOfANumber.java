import java.util.Arrays;
import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number whose factors you want");
        int number=sc.nextInt();
        int size=0;
        int maxfactor=1;
        int[] factor=new int[maxfactor];
        for(int i=1;i<=number;i++){
            if(size==maxfactor){
                maxfactor*=2;
                int[] newarr=new int[maxfactor];
                for(int j=0;j<size;j++){
                    newarr[j]=factor[j];
                }
                factor=newarr;
            }
            if(number%i==0){
                factor[size]=i;
                size++;
                count++;
            }
        }
        int[] factor2=new int[count];
        for(int i=0;i<count;i++){
            factor2[i]=factor[i];
        }
        System.out.println(Arrays.toString(factor2));
    }
}
