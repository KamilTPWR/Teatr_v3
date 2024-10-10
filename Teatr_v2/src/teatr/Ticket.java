package teatr;

public class Ticket {
    //Struct
    private static int ticketCounter = 0;
    private int ticketId;
    private Spectacle spectacle;
    private int seatNumber;

    //Constructor
    public Ticket(Spectacle spectacle, int seatNumber) {
        this.ticketId = ++ticketCounter;
        this.spectacle = spectacle;
        this.seatNumber = seatNumber;
    }

    public int getTicketId() {
        return ticketId;
    }
    public Spectacle getSpectacle() {
        return spectacle;
    }
    public int getSeatNumber() {
        return seatNumber;
    }

    public void showInfo() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Spectacle: " + spectacle.getTitle());
        System.out.println("Seat Number: " + seatNumber);
    }
}