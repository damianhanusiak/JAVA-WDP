public abstract class Pracownik implements Printable1 {
    private String imie, nazwisko, stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    protected void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String getStanowisko() {
        return stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getPensja() {
        return pensja;
    }

    public abstract int getLiczba();

    // public abstract String getImieINazwisko();

    // public abstract String getStanowisko();

    // public abstract double getPensja();
}
