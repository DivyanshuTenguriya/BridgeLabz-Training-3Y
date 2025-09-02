import java.sql.SQLOutput;
import java.util.Scanner;

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bookinglist=0;
        int waitingList=0;
        System.out.println("Enter train sitting capacity");
        int sitingCapicity=sc.nextInt();
        boolean continueBooking=true;
        do{
            System.out.println("Choose your train");
            System.out.println("1. Express:Rs500");
            System.out.println("2.Superfast:Rs800");
            System.out.println("3.Rajdhani:Rs1000");
            int choice=sc.nextInt();
            int fare=0;
            switch(choice){
                case 1:
                    fare=500;
                    break;
                case 2:
                    fare=800;
                    break;
                case 3:
                    fare=1000;
                    break;
                default:
                    System.out.println("Invalid train. Since we consider your choice Express");
                    fare=500;
            }
            System.out.println("Enter number of passenger to register");
            int members=sc.nextInt();
            for(int i=1;i<=members;i++){
                if(bookinglist<sitingCapicity){
                    bookinglist++;
                    System.out.println("Passenger "+i+"th registered successfully and fare is: "+fare );
                }
                else{
                    waitingList++;
                    System.out.println("Passenger "+i+"th is added to waitinglist");
                }
            }
            if(bookinglist>=sitingCapicity){
                System.out.println("Train Seats are full. Only waiting list is available");
            }
            System.out.println("Do you want to make more booking (y/n)");
            String ans= sc.next();
            if(ans.equalsIgnoreCase("n")){
                continueBooking=false;
            }
        }while (continueBooking);
        System.out.println("Booked Seats "+bookinglist);
        System.out.println("Waiting List "+waitingList);
    }
}
