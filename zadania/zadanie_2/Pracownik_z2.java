public abstract class Pracownik_z2 implements Wynagrodzenia_z2 {
    private String imie, nazwisko;
    private double pensja;

    public Pracownik_z2(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public double getPensja() {
        return pensja;
    }

    @Override
    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getImieINazwisko() {
        return imie + " " + nazwisko;
    };

    public void zwiekszPensje(double podwyszka) {
        pensja = pensja + podwyszka;
    }
}
