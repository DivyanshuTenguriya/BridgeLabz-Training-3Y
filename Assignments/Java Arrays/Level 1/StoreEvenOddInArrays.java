import java.util.Arrays;
import java.util.Scanner;

public class StoreEvenOddInArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number<1){
            System.out.println("Error");
        }
        else{
            int size=number/2;
            int[] even=new int[size];
            if(number%2==1){
                size++;
            }
            int[] odd=new int[size];
            int i=0;
            int j=0;
            for(int k=1;k<=number;k++){
                if(k%2==0){
                    even[i]=k;
                    i++;
                }
                else{
                    odd[j]=k;
                    j++;
                }
            }
            System.out.println(Arrays.toString(even));
            System.out.println(Arrays.toString(odd));
        }
    }
}
