import java.util.*;
public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=0;
        System.out.println("Enter how many transactions you want to perform");
        int number_of_transaction = sc.nextInt();
        int[] transaction = new int[number_of_transaction];
        int diposit = 0;
        int withdrawal = 0;
        for(int j=0;j<number_of_transaction;j++) {
            System.out.println("What you want ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Exit");
            System.out.println("Please enter the number of given choices");
            int choice = sc.nextInt();
            if(choice==1 || choice==2) {
                transaction[j] = sc.nextInt();
                for (int i = 0; i < number_of_transaction; i++) {
                    if (transaction[i] > 0) {
                        diposit += transaction[i];
                    } else {
                        withdrawal += transaction[i];
                    }
                }
            }
        }
        int total_balance = diposit + withdrawal;
        if (total_balance < 0) {
            System.out.println("Overdraft");
        } else {
            System.out.println("Your current balance is " + total_balance);
        }
    }
}
