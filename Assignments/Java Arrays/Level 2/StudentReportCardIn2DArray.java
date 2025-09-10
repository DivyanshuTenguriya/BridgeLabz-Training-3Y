import java.util.Scanner;

public class StudentReportCardIn2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int number=sc.nextInt();
        double[][] marks =new double[number][3];
        double[] percentage=new double[number];
        String[] grade=new String[number];
        for(int i=0;i<number;i++){
            double percent=0;
            for(int j=0;j<3;){
                if(j==0){
                    System.out.println("Enter marks of physics for student "+(i+1));
                    double p=sc.nextDouble();
                    if(p<0){
                        System.out.println("Invalid marks.Enter again");
                    }
                    else{
                        marks[i][j]=p;
                        percent+=p;
                        j++;
                    }
                }
                else if(j==1){
                    System.out.println("Enter marks of chemistry for student "+(i+1));
                    double c=sc.nextDouble();
                    if(c<0){
                        System.out.println("Invalid marks.Enter again");
                    }
                    else{
                        marks[i][j]=c;
                        percent+=c;
                        j++;
                    }
                }
                else if(j==2){
                    System.out.println("Enter marks of maths for student "+(i+1));
                    double m=sc.nextDouble();
                    if(m<0){
                        System.out.println("Invalid marks.Enter again");
                    }
                    else{
                        marks[i][j]=m;
                        percent+=m;
                        j++;
                    }
                }
            }
            percent=(percent*100)/300;
            percentage[i]=Math.round(percent*100.0)/100.0;
            if(percentage[i]>=80 && percentage[i]<=100){
                grade[i]="A";
            }
            else if(percentage[i]>=70 && percentage[i]<80){
                grade[i]="B";
            }
            else if(percentage[i]>=60 && percentage[i]<70){
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
        System.out.println("No.     Physics     Chemistry     Maths    Percentage   Grade");
        for(int i=0;i<number;i++){
            System.out.print(" "+(i+1));
            for(int j=0;j<3;j++){
                System.out.print("        "+marks[i][j]);
            }
            System.out.print("        "+percentage[i]);
            System.out.println("        "+grade[i]);
        }
    }
}
