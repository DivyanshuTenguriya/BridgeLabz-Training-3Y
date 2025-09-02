import java.util.*;
public class TableOfFixedNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=0;
        int[] result=new int[10];
        while(true){
            int n=sc.nextInt();
            if(n>=6 && n<=9){
                m=n;
                break;
            }
            System.out.println("Invalid Number");
        }
        for(int i=0;i<10;i++){
            result[i]=(i+1)*m;
            System.out.println(m+" * "+(i+1)+" = "+result[i]);
        }
    }
}
