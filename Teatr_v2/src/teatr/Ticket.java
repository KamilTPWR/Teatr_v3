package teatr;

public class Ticket {
    private static int ticketCounter = 0; // Licznik biletów do unikalnego ID
    private int ticketId;
    private Spectacle spectacle;
    private int seatNumber;

    // Konstruktor
    public Ticket(Spectacle spectacle, int seatNumber) {
        this.ticketId = ++ticketCounter; // Zwiększanie licznika i przypisanie ID
        this.spectacle = spectacle;
        this.seatNumber = seatNumber;
    }

    // Metoda do wyświetlenia informacji o bilecie
    public void displayInfo() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Spectacle: " + spectacle.getTitle());
        System.out.println("Seat Number: " + seatNumber);
    }

    // Getter dla ticketId
    public int getTicketId() {
        return ticketId;
    }

    // Getter dla spektaklu
    public Spectacle getSpectacle() {
        return spectacle;
    }

    // Getter dla seatNumber
    public int getSeatNumber() {
        return seatNumber;
    }
}