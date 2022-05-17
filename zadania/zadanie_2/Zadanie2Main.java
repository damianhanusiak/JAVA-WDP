import java.util.ArrayList;

public class Zadanie2Main {
    public static void main(String[] args) {
        ArrayList<Pracownik_z2> pracownicy = new ArrayList<>();
        pracownicy.add(new Kierowca_z2("Damian", "Hanusiak", 2500));
        pracownicy.add(new Kierowca_z2("Bartek", "Kowal", 3500));
        pracownicy.add(new Magazynier_z2("Bartek", "Kowal", 3500));
        pracownicy.add(new Magazynier_z2("Bartek", "Kowal", 3500));

        for (Pracownik_z2 p : pracownicy) {
            System.out.println("Imie i nazwisko: " + p.getImieINazwisko() + " Pensja: " + p.getPensja());
        }

        for (Pracownik_z2 p : pracownicy) {
            p.zwiekszPensje(250);
            System.out.println("Imie i nazwisko: " + p.getImieINazwisko() + " Pensja: " + p.getPensja());
        }
    }
}
