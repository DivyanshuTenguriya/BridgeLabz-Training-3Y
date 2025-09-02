import java.util.Scanner;
public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Batsmen who have bat in team.");
        int number_of_players=sc.nextInt();
        int[] runs=new int[number_of_players];
        for(int i=0;i<number_of_players;i++){
            System.out.println("Enter runs of player"+(i+1));
            runs[i]=sc.nextInt();
        }
        int sum=0;
        int max=runs[0];
        int min=runs[0];
        int count=0;
        for(int i=0;i<number_of_players;i++){
            sum+=runs[i];
            if (runs[i] > max) {
                max=runs[i];
            }
            if(runs[i]<min){
                min=runs[i];
            }
            if(runs[i]>=100){
                count++;
            }

        }
        int[] century_players=new int[count];
        int t=0;
        for(int i=0;i<number_of_players;i++){
            if(runs[i]>=100){
                century_players[t]=runs[i];
                t++;
            }
        }
        int a=sum/number_of_players;
        System.out.println("Minimum score is "+min);
        System.out.println("Maximum score is "+max);
        System.out.println("Average Score is "+a);
        for(int i=0;i<count;i++){
            System.out.println("Century Scored");
        }


    }
}
