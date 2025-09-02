import java.util.*;
public class MeanHeightOfPlayer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] height=new double[11];
        double sum=0d;
        for(int i=0;i<11;i++){
            height[i]=sc.nextDouble();
            sum+=height[i];
        }
        System.out.println("The mean height of 11 players is "+(sum/11));

    }
}
