package teatr;

import java.util.ArrayList;

public class TheaterManager {
    private final ArrayList<Spectacle> spectacles;
    private final ArrayList<TheaterHall> halls;

    //Constructor
    public TheaterManager() {
        this.spectacles = new ArrayList<>();
        this.halls = new ArrayList<>();
    }

    //Spectacle management
    public void addSpectacle(Spectacle spectacle) {
        spectacles.add(spectacle);
        System.out.println("Spectacle added: " + spectacle.getTitle());
    }
    public void removeSpectacle(String title) {
        for (int i = 0; i < spectacles.size(); i++) {
            if (spectacles.get(i).getTitle().equals(title)) {
                System.out.println("Removing spectacle: " + spectacles.get(i).getTitle());
                spectacles.remove(i);
                return;
            }
        }
        System.out.println("Spectacle: " + title + ", not found!");
    }
    public void listSpectacles() {
        if (spectacles.isEmpty()) {
            System.out.println("No spectacles available.");
        } else {
            System.out.println("Available spectacles:");
            for (int i = 0; i < spectacles.size(); i++) {
                spectacles.get(i).showInfo(); // Access each spectacle by index
            }
        }
    }

    //TheaterHalls management
    public void addHall(TheaterHall hall) {
        halls.add(hall);
        System.out.println("Hall added: " + hall.getHallName());
    }
    public void removeHall(String HallName) {
        for (int i = 0; i < halls.size(); i++) {
            if (halls.get(i).getHallName().equals(HallName)) {
                System.out.println("Removing hall: " + halls.get(i).getHallName());
                halls.remove(i);
                return;
            }
        }
        System.out.println("Spectacle: " + HallName + ", not found!");
    }
    public void listHalls() {
        if (halls.isEmpty()) {
            System.out.println("No halls available.");
        } else {
            System.out.println("Available halls:");
            for (TheaterHall h : halls) {
                h.showInfo();
            }
        }
    }
}