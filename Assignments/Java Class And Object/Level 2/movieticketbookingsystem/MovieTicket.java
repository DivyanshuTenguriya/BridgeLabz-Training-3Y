package movieticketbookingsystem;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }
    public void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName);
        } else {
            System.out.println("Ticket already booked!");
        }
    }
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet for " + movieName);
        }
    }
}
