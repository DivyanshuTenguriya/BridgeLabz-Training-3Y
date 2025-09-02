import java.util.*;
public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] table=new int[10];
        for(int i=0;i<10;i++){
            System.out.println(n+" * "+(i+1)+" = "+(n*(i+1)));
        }
    }
}
