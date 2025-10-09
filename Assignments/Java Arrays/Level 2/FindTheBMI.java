import java.util.Scanner;

public class FindTheBMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of persons in team");
        int number=sc.nextInt();
        double[] weight=new double[number];
        double[] height=new double[number];
        double[] BMI=new double[number];
        String[] weight_status=new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter the weight(in kg) of person "+(i+1));
            weight[i]=sc.nextDouble();
            System.out.println("Enter the height(in meters) of person "+(i+1));
            height[i]=sc.nextDouble();
            double temp=height[i];
            BMI[i]=weight[i]/(Math.pow(height[i],2));
            if(BMI[i]<=18.4){
                weight_status[i]="Underweight";
            }
            else if(BMI[i]>=18.5 && BMI[i]<=24.9){
                weight_status[i]="Normal";
            }
            else if(BMI[i]>=25 && BMI[i]<=39.9){
                weight_status[i]="Overweight";
            }
            else{
                weight_status[i]="Obese";
            }
        }
        System.out.println("       Height          Weight               BMI              WeightStatus");
        for(int i=0;i<number;i++){
            System.out.println((i+1)+"       "+height[i]+"             "+weight[i]+"               "+Math.round(BMI[i]*100.0)/100.0+"              "+weight_status[i]);
        }

    }
}

