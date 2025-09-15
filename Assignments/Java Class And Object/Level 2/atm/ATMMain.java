package atm;
import java.util.*;

public class ATMMain { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount("Divyanshu", 12345, 1000);
    int choice;
    do {
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

            case 3:
                account.displayBalance();
                break;

            case 4:
                System.out.println("Thank you for using ATM!");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 4);
}
}
