import java.util.Scanner;

public class StudentsReportCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Students");
        int number =sc.nextInt();
        double[] physics=new double[number];
        double[] chemistry=new double[number];
        double[] maths=new double[number];
        double[] percentage=new double[number];
        String[] grade=new String[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter marks of physics for student "+(i+1));
            double p=sc.nextDouble();
            if(p<0){
                System.out.println("Invalid marks");
                i--;
            }
            else{
                physics[i]=p;
            }
        }
        for(int i=0;i<number;i++){
            System.out.println("Enter marks of chemistry for student "+(i+1));
            double c=sc.nextDouble();
            if(c<0){
                System.out.println("Invalid marks");
                i--;
            }
            else{
                chemistry[i]=c;
            }
        }
        for(int i=0;i<number;i++){
            System.out.println("Enter marks of maths for student "+(i+1));
            double m=sc.nextDouble();
            if(m<0){
                System.out.println("Invalid marks");
                i--;
            }
            else{
                maths[i]=m;
            }
        }
        for(int i=0;i<number;i++){
            double per=((physics[i]+chemistry[i]+maths[i])*100)/300;
            percentage[i]=Math.round(per*100.0)/100.0;
            if(percentage[i]>=80 && percentage[i]<=100){
                grade[i]="A";
            }
            else if(percentage[i]>=70 && percentage[i]<80){
                grade[i]="B";
            }
            else if (percentage[i]>=60 && percentage[i]<70) {
                grade[i]="C";
            }
            else if(percentage[i]>=50 && percentage[i]<60){
                grade[i]="D";
            }
            else if(percentage[i]>=40 && percentage[i]<50){
                grade[i]="E";
            }
            else if(percentage[i]>=0 && percentage[i]<40){
                grade[i]="R";
            }
        }
        System.out.println("     Physics       Chemistry       Maths       Percentage(%)       Grade");
        for(int i=0;i<number;i++){
            System.out.println((i+1)+"     "+physics[i]+"            "+chemistry[i]+"         "+maths[i]+"          "+percentage[i]+"%              "+grade[i]);
        }
    }
}
