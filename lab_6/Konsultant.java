public class Konsultant extends Pracownik {

    private int liczbaKlientow;

    public Konsultant(String imie, String nazwisko, double pensja, int liczbaKlientow) {
        super(imie, nazwisko, pensja);
        this.liczbaKlientow = liczbaKlientow;
        setStanowisko("Konsultant");
    }

    public int getLiczba() {
        // System.out.println("Liczba projektow: " + liczbaKlientow);
        return liczbaKlientow;
    }
}