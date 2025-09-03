import java.util.Arrays;
import java.util.Scanner;

public class BonusForCompany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salary=new double[10];
        double[] year=new double[10];
        double[] bonus=new double[10];
        double[] new_salary=new double[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the working year of employee"+(i+1));
            year[i]=sc.nextDouble();
            System.out.println("Enter the salary of employee"+(i+1));
            salary[i]=sc.nextDouble();
            if(year[i]<=0 || salary[i]<=0) {
                System.out.println("Invalid Year or Salary.Reenter again");
                i--;
            }
        }
        double totalBonus=0;
        double totalold=0;
        double totalNew=0;
        for(int i=0;i<10;i++){
            if(year[i]>5){
                bonus[i]=salary[i]*0.05;
                new_salary[i]=salary[i]+bonus[i];
            }
            else if(year[i]<=5){
                bonus[i]=salary[i]*0.02;
                new_salary[i]=salary[i]+bonus[i];
            }
            totalold+=salary[i];
            totalNew+=new_salary[i];
            totalBonus+=bonus[i];
        }
        for(int i=0;i<10;i++){
            System.out.println("Year of working of employee "+(i+1)+" is "+year[i]);
            System.out.println("Salary of employee "+(i+1)+" is "+salary[i]);
            System.out.println("Bonus given to employee "+(i+1)+" is "+bonus[i]);
            System.out.println("New salary of employee "+(i+1)+" is "+new_salary[i]);
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
        System.out.println("Total old salary given by Zara is "+totalold);
        System.out.println("Total bonus given by Zara is "+totalBonus);
        System.out.println("Total new salary given by Zara is "+totalNew);

    }
}
