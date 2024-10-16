package teatr;

public class TheaterHall {
    private String hallName;
    private int capacity; // Total number of seats
    private int flor; // Optional: hall's flor or description

    // Constructor
    public TheaterHall(String hallName, int capacity, int flor) {
        this.hallName = hallName;
        this.capacity = capacity;
        this.flor = flor;
    }

    //Getters
    public String getHallName() {
        return hallName;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getLocation() {
        return flor;
    }

    //Methods
    public void showInfo() {
        System.out.println("Hall Name: " + hallName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Location: " + flor);
    }
}