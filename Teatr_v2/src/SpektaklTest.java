package teatr;

public class SpektaklTest {
    public static void main(String[] args) {
        testConstructorAndGetters();
        testSetters();
        testInvalidDD();
        testInvalidMM();
        testInvalidYYYY();
    }

    public static void testConstructorAndGetters() {
        Spektakl spektakl = new Spektakl("Hamlet", 15, 10, 2024, 150);

        // Testowanie tytułu
        assert "Hamlet".equals(spektakl.gettitle()) : "Błąd: tytuł jest nieprawidłowy.";

        // Testowanie daty
        assert spektakl.getDD() == 15 : "Błąd: dzień jest nieprawidłowy.";
        assert spektakl.getMM() == 10 : "Błąd: miesiąc jest nieprawidłowy.";
        assert spektakl.getYYYY() == 2024 : "Błąd: rok jest nieprawidłowy.";

        // Testowanie liczby miejsc
        assert spektakl.getnumber_of_seats() == 150 : "Błąd: liczba miejsc jest nieprawidłowa.";

        System.out.println("testConstructorAndGetters zakończony pomyślnie.");
    }

    public static void testSetters() {
        Spektakl spektakl = new Spektakl("Hamlet", 15, 10, 2024, 150);

        // Testowanie settera dla tytułu
        spektakl.settitle("Romeo i Julia");
        assert "Romeo i Julia".equals(spektakl.gettitle()) : "Błąd: tytuł nie został zaktualizowany.";

        // Testowanie settera dla dnia
        spektakl.setDD(20);
        assert spektakl.getDD() == 20 : "Błąd: dzień nie został zaktualizowany.";

        // Testowanie settera dla miesiąca
        spektakl.setMM(11);
        assert spektakl.getMM() == 11 : "Błąd: miesiąc nie został zaktualizowany.";

        // Testowanie settera dla roku
        spektakl.setYYYY(2025);
        assert spektakl.getYYYY() == 2025 : "Błąd: rok nie został zaktualizowany.";

        // Testowanie settera dla liczby miejsc
        spektakl.setnumber_of_seats(200);
        assert spektakl.getnumber_of_seats() == 200 : "Błąd: liczba miejsc nie została zaktualizowana.";

        System.out.println("testSetters zakończony pomyślnie.");
    }

    public static void testInvalidDD() {
        Spektakl spektakl = new Spektakl("Hamlet", 15, 10, 2024, 150);

        // Ustawienie nieprawidłowego dnia
        spektakl.setDD(32);
        assert spektakl.getDD() == 15 : "Błąd: dzień powinien pozostać niezmieniony.";

        System.out.println("testInvalidDD zakończony pomyślnie.");
    }

    public static void testInvalidMM() {
        Spektakl spektakl = new Spektakl("Hamlet", 15, 10, 2024, 150);

        // Ustawienie nieprawidłowego miesiąca
        spektakl.setMM(13);
        assert spektakl.getMM() == 10 : "Błąd: miesiąc powinien pozostać niezmieniony.";

        System.out.println("testInvalidMM zakończony pomyślnie.");
    }

    public static void testInvalidYYYY() {
        Spektakl spektakl = new Spektakl("Hamlet", 15, 10, 2024, 150);

        // Ustawienie nieprawidłowego roku
        spektakl.setYYYY(2019);
        assert spektakl.getYYYY() == 2024 : "Błąd: rok powinien pozostać niezmieniony.";

        System.out.println("testInvalidYYYY zakończony pomyślnie.");
    }
}