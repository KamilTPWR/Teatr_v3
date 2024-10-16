import teatr.*;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Spectacle
        Spectacle spectacle1 = new Spectacle("Hamlet", 15, 10, 2024, 100);
        Spectacle spectacle2 = new Spectacle("Macbeth", 20, 10, 2024, 150);
        Spectacle spectacle3 = new Spectacle("Romeo and Juliet", 25, 10, 2024, 200);

        // Displaying information about each spectacle
        System.out.println("Spectacle Information:");
        spectacle1.showInfo();
        System.out.println();
        spectacle2.showInfo();
        System.out.println();
        spectacle3.showInfo();
        System.out.println();

        // Creating tickets for spectacles
        Ticket ticket1 = new Ticket(spectacle1, 10); // Seat 10 for Hamlet
        Ticket ticket2 = new Ticket(spectacle2, 20); // Seat 20 for Macbeth
        Ticket ticket3 = new Ticket(spectacle3, 15); // Seat 15 for Romeo and Juliet

        // Displaying ticket information
        System.out.println("Ticket Information:");

        ticket1.showInfo();
        System.out.println(ticket1.getSeatNumber());
        System.out.println();

        ticket2.showInfo();
        System.out.println(ticket2.getSeatNumber());
        System.out.println();

        ticket3.showInfo();
        System.out.println(ticket3.getSeatNumber());
        System.out.println();

        TheaterHall theaterHall3 = new TheaterHall("A1",150,2);
        theaterHall3.showInfo();
        System.out.println();

        // Attempting to create a ticket for an already taken seat
        Ticket ticket4 = new Ticket(spectacle1, 10); // Attempt to use the same seat for Hamlet

        // Displaying total tickets created
        System.out.println("Total Tickets Created: " + Ticket.getTicketCounter());
    }
}