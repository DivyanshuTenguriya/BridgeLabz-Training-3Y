import java.util.*;
public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0;i<5;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(nums[i]>0){
                if(nums[i]%2==0){
                    System.out.println("Even Positive");
                }
                else{
                    System.out.println("Odd Positive");
                }
            }
            else if (nums[i]==0) {
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }
        if(nums[0]>nums[4]){
            System.out.println("First is greater");
        }
        else if(nums[0]==nums[4]){
            System.out.println("First is Equal to Last");
        }
        else{
            System.out.println("First is smaller");
        }
    }
}
