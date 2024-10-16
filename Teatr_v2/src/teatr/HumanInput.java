package teatr;

import java.util.Scanner;

public class HumanInput {
    private final Scanner scanner;
    private final TheaterManager manager;

    public HumanInput(TheaterManager manager) {
        this.scanner = new Scanner(System.in);
        this.manager = manager;
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void gapConsole() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public void addSpectacleFromConsole() {
        System.out.println("Enter spectacle title: ");
        String title = scanner.nextLine();

        System.out.println("Enter day (DD): ");
        int DD = scanner.nextInt();

        System.out.println("Enter month (MM): ");
        int MM = scanner.nextInt();

        System.out.println("Enter year (YYYY): ");
        int YYYY = scanner.nextInt();

        System.out.println("Enter number of seats: ");
        int number_of_seats = scanner.nextInt();

        Spectacle spectacle = new Spectacle(title, DD, MM, YYYY, number_of_seats);
        manager.addSpectacle(spectacle);

        scanner.nextLine();
    }

    public void removeSpectacleFromConsole() {
        System.out.println("Enter the title of the spectacle to remove: ");
        String title = scanner.nextLine();
        manager.removeSpectacle(title);
    }

    public void addHallFromConsole() {
        System.out.println("Enter theater hall name: ");
        String hallName = scanner.nextLine();

        System.out.println("Enter hall capacity: ");
        int capacity = scanner.nextInt();

        System.out.println("Enter floor number: ");
        int floor = scanner.nextInt();

        // Create the TheaterHall object and add it to the TheaterManager
        TheaterHall hall = new TheaterHall(hallName, capacity, floor);
        manager.addHall(hall);

        scanner.nextLine(); // Consume the newline left after nextInt()
    }

    public void listSpectaclesFromConsole() {
        manager.listSpectacles();
    }

    public void listHallsFromConsole() {
        manager.listHalls();
    }
}

