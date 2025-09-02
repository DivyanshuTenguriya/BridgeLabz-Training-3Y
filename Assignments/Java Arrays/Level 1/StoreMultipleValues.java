import java.util.*;
public class StoreMultipleValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        double sum=0.0d;
        int i=0;
        int count=0;
        while(true){
            double element=sc.nextDouble();
            count++;
            if(element<=0){
                break;
            }
            arr[i]=element;
            i++;
            if(i==10){
                break;
            }
        }
        for(int j=0;j<10;j++){
            sum=sum+arr[j];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Total value = "+sum);
    }
}
