import java.time.LocalDate;

public class Student1 {
    private String imie, nazwisko;
    private LocalDate dataUrodzenia;

    public Student1(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getdataUrodzenia() {
        return dataUrodzenia;
    }

}