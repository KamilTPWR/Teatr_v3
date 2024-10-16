package teatr;

public class Spectacle {
    //Struct
    private String title;
    private int DD;
    private int MM;
    private int YYYY;
    private int number_of_seats;

    //Constructor
    public Spectacle(String title, int DD, int MM, int YYYY, int number_of_seats) {
        this.title = title;
        this.setDD(DD);
        this.setMM(MM);
        this.setYYYY(YYYY);
        this.number_of_seats = number_of_seats;
    }

    //Setters and Getters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getDD() {
        return DD;
    }
    public void setDD(int DD) {
        if (DD > 0 && DD <= 31) {
            this.DD = DD;
        } else {
            System.out.println("Invalid day. Please enter a value from 1 to 31.");
        }
    }

    public int getMM() {
        return MM;
    }
    public void setMM(int MM) {
        if (MM > 0 && MM <= 12) {
            this.MM = MM;
        } else {
            System.out.println("Invalid month. Please enter a value from 1 to 12.");
        }
    }

    public int getYYYY() {
        return YYYY;
    }
    public void setYYYY(int YYYY) {
        if (YYYY >= 2000 && YYYY <= 2050) {
            this.YYYY = YYYY;
        } else {
            System.out.println("Invalid year. Please enter a value from 2000 to 2050.");
        }
    }

    public int getNumber_of_seats(){
        return number_of_seats;
    }
    public void setNumber_of_seats(int number_of_seats){
        this.number_of_seats = number_of_seats;
    }

    //Methods
    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Date: " + DD + "/" + MM + "/" + YYYY);
        System.out.println("Number of seats: " + number_of_seats);
    }
}
