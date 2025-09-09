import java.util.Arrays;
import java.util.Scanner;

public class BMIIn2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of persons");
        int number=sc.nextInt();
        double[][] personData=new double[number][3];
        String[] weightStatus=new String[number];
        for(int i=0;i<number;i++){
            for(int j=0;j<3;j++){
                double bmi=0;
                if(j==0){
                    System.out.println("Enter weight in kg");
                    double weight=sc.nextDouble();
                    if(weight<0){
                        System.out.println("Invalid weight. Enter your correct weight");
                        j--;
                    }
                    else{
                        personData[i][j]=weight;
                    }
                }
                else if(j==1){
                    System.out.println("Enter your height in meters");
                    double height= sc.nextDouble();
                    if(height<=0){
                        System.out.println("Invalid height. Enter your correct height");
                        j--;
                    }
                    else{
                        personData[i][j]=height;
                    }
                }
                else{
                    bmi=personData[i][0]/Math.pow(personData[i][1],2);
                    personData[i][2]=Math.round(bmi*100.0)/100.0;
                }
            }
        }
        for(int i=0;i<number;i++){
            if(personData[i][2]<=18.4){
                weightStatus[i]="Underweight";
            }
            else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
                weightStatus[i]="Normal";
            }
            else if(personData[i][2]>=25.0 && personData[i][2]<=39.9){
                weightStatus[i]="Overweight";
            }
            else{
                weightStatus[i]="Obese";
            }
        }
        for(int i=0;i<number;i++){
            for(int j=0;j<3;j++){
                System.out.print("    "+personData[i][j]);
            }
            System.out.print("    "+weightStatus[i]);
            System.out.println("");
        }
    }
}
