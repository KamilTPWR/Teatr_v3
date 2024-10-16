package teatr;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Ticket {
    //Struct
    private static final Set<Integer> existingTicketIds = new HashSet<>();
    private static final Set<Integer> existingSeatNumbers = new HashSet<>();
    private static int ticketCounter = 0;
    private int ticketId;
    private Spectacle spectacle;
    private int seatNumber;

    //Constructor
    public Ticket(Spectacle spectacle, int seatNumber) {
        do {
            ticketId = generateUniqueTicketId();
        } while (existingTicketIds.contains(ticketId));

        existingTicketIds.add(ticketId);

        // Ensure the seat number is unique
        if (existingSeatNumbers.contains(seatNumber)) {
            System.out.println("Seat number " + seatNumber + " is already taken. Please choose a different seat.");
            return; // Exit constructor without creating a ticket
        }

        existingSeatNumbers.add(seatNumber);

        this.spectacle = spectacle;
        this.seatNumber = seatNumber;
        ticketCounter++;
    }

    private int generateUniqueTicketId() {
        Random random = new Random();
        return 1000000000 + random.nextInt(900000000);
        //Generates a number between 1000000000 and 1999999999; it's UniqueTicket Ids
    }

//    public Spectacle getSpectacle() {
//        return spectacle;
//    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public static int getTicketCounter() {
        return ticketCounter;
    }

    public void showInfo() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Spectacle: " + spectacle.getTitle());
        System.out.println("Seat Number: " + seatNumber);
    }
}