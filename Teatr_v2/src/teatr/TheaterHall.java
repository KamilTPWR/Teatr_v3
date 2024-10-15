package teatr;

public class TheaterHall {
    private String hallName;
    private int capacity; // Total number of seats
    private String location; // Optional: hall's location or description

    // Constructor
    public TheaterHall(String hallName, int capacity, String location) {
        this.hallName = hallName;
        this.capacity = capacity;
        this.location = location;
    }

    //Getters
    public String getHallName() {
        return hallName;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getLocation() {
        return location;
    }

    //Methods
    public void displayInfo() {
        System.out.println("Hall Name: " + hallName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Location: " + location);
    }
}