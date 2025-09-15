package movieticketbookingsystem;

public class MovieBookingSystem {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        ticket1.bookTicket(12, 250);
        ticket1.displayTicket();
    }

}
