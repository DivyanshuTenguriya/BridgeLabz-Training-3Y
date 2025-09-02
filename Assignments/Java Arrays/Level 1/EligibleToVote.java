import java.sql.SQLOutput;
import java.util.*;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            int agev=sc.nextInt();
            if(agev<0){
                System.out.println("Invalid Age");
                i--;
            }
            else{
                age[i]=agev;
            }
        }
        for(int i=0;i<10;i++){
            if(age[i]<18){
                System.out.println("The student with the age "+age[i]+" cannot vote.");
            }
            else{
                System.out.println("The student with the age "+age[i]+" can vote");
            }
        }
    }
}
