import java.util.Arrays;
import java.util.Scanner;

public class Transfering2DArrayTo1DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=sc.nextInt();
        System.out.println("Enter number of Columns");
        int column=sc.nextInt();
        int[][] matrix=new int[row][column];
        int size=0;
        int[] arr=new int[row*column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter element at "+i+" "+j);
                matrix[i][j]=sc.nextInt();
                arr[size]=matrix[i][j];
                size++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
