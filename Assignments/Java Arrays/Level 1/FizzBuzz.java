import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc.nextInt();
        if(number<0){
            System.out.println("Invalid");
        }
        else{
            String[] fizzbuzz=new String[number];
            for(int i=0;i<number;i++){
                if((i+1)%3==0 && (i+1)%5==0){
                    fizzbuzz[i]="FizzBuzz";
                }
                else if((i+1)%3==0){
                    fizzbuzz[i]="Fizz";
                }
                else if((i+1)%5==0){
                    fizzbuzz[i]="Buzz";
                }
                else{
                    fizzbuzz[i]=""+(i+1);
                }

            }
            for(int i=0;i<number;i++){
                System.out.println("Position "+(i+1)+" = "+fizzbuzz[i]);
            }
        }
    }
}
