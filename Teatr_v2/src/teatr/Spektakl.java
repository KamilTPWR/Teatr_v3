package teatr;

public class Spektakl {
    // Prywatne pola
    private String tytul;
    private int day;
    private int month;
    private int year;
    private int liczbaMiejsc;

    // Konstruktor klasy Spektakl
    public Spektakl(String tytul, int day, int month, int year, int liczbaMiejsc) {
        this.tytul = tytul;
        this.setDay(day);  // Używamy setterów, żeby zastosować walidację
        this.setMonth(month);
        this.setYear(year);
        this.liczbaMiejsc = liczbaMiejsc;
    }

    // Getter do tytułu spektaklu
    public String getTytul() {
        return tytul;
    }

    // Setter do tytułu spektaklu
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    // Getter do dnia
    public int getDay() {
        return day;
    }

    // Setter do dnia (z walidacją)
    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Błędna wartość dnia. Podaj wartość od 1 do 31.");
        }
    }

    // Getter do miesiąca
    public int getMonth() {
        return month;
    }

    // Setter do miesiąca (z walidacją)
    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Błędna wartość miesiąca. Podaj wartość od 1 do 12.");
        }
    }

    // Getter do roku
    public int getYear() {
        return year;
    }

    // Setter do roku (z walidacją)
    public void setYear(int year) {
        if (year >= 2020 && year <= 2050) {
            this.year = year;
        } else {
            System.out.println("Błędna wartość roku. Podaj rok pomiędzy 2020 a 2050.");
        }
    }

    // Getter do liczby miejsc
    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    // Setter do liczby miejsc
    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    // Metoda do wyświetlania informacji o spektaklu
    public void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Data: " + day + "/" + month + "/" + year);
        System.out.println("Liczba miejsc: " + liczbaMiejsc);
    }
}
