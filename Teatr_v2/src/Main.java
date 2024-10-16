import teatr.*;
import java.util.Scanner;

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

        TheaterHall theaterHall3 = new TheaterHall("A1", 150, 2);
        theaterHall3.showInfo();
        System.out.println();

        // Attempting to create a ticket for an already taken seat
        Ticket ticket4 = new Ticket(spectacle1, 10); // Attempt to use the same seat for Hamlet

        // Displaying total tickets created
        System.out.println("Total Tickets Created: " + Ticket.getTicketCounter());

        TheaterManager manager = new TheaterManager();
        HumanInput input = new HumanInput(manager);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;


        while (!exit) {
            HumanInput.gapConsole();
            System.out.println("=======================================");
            System.out.println("||     Theater Management System      ||");
            System.out.println("=======================================");
            System.out.println("|| 1. Add Spectacle                   ||");
            System.out.println("|| 2. Remove Spectacle                ||");
            System.out.println("|| 3. List Spectacles                 ||");
            System.out.println("|| 4. Add Theater Hall                ||");
            System.out.println("|| 5. List Theater Halls              ||");
            System.out.println("|| 6. Exit                            ||");
            System.out.println("=======================================");
            HumanInput.gapConsole();
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character left after nextInt()


            switch (choice) {
                case 1:
                    HumanInput.clearConsole();
                    input.addSpectacleFromConsole();
                    break;
                case 2:
                    HumanInput.gapConsole();
                    input.removeSpectacleFromConsole();
                    break;
                case 3:
                    HumanInput.gapConsole();
                    input.listSpectaclesFromConsole();
                    break;
                case 4:
                    HumanInput.clearConsole();
                    input.addHallFromConsole();
                    break;
                case 5:
                    HumanInput.gapConsole();
                    input.listHallsFromConsole();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
        scanner.close(); // Close the scanner when done
    }
}