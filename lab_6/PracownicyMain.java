import java.util.ArrayList;

public class PracownicyMain {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new ProjectManager("Przemyslaw", "Golba", 15000, 7));
        pracownicy.add(new ProjectManager("Damian", "Hanusiak", 10000, 5));
        pracownicy.add(new Konsultant("Szymon", "Galysa", 8000, 15));
        pracownicy.add(new Konsultant("Kamil", "Proszek", 7000, 12));

        for (Pracownik p : pracownicy) {
            System.out.println("Stanowisko: " + p.getStanowisko() + " Imie: " + p.getImie() + " Nazwisko: "
                    + p.getNazwisko() + " Pensja: " + p.getPensja() + " Liczba: " + p.getLiczba());
        }
    }
}
