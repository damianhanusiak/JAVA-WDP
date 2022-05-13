import java.time.LocalDateTime;

public class Czlowiek {
    // pola - domyślnie publiczne, nie jak w c++ prywatne
    private String imie, nazwisko;
    private int wiek;
    private LocalDateTime timeOfCreation = LocalDateTime.now();
    private static int objectCount = 0;

    // konstruktor
    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        objectCount++;
    }
    // lub ewentualnie bez this
    // public Czlowiek(String im, String na) {
    // imie = im;
    // nazwisko = na;
    // }

    public Czlowiek(String imie, String nazwisko, int wiek) {
        this(imie, nazwisko); // wykorzystanie już wcześniej utworzonego konstruktora
        this.wiek = wiek;
    }

    public String get_imie() {
        return imie;
    }

    public String get_nazwisko() {
        return nazwisko;
    }

    public int get_wiek() {
        return wiek;
    }

    public LocalDateTime getDateTimeOfCreation() {
        return timeOfCreation;
    }

    public int getInstanceNo() {
        return objectCount;
    }
}
