public class Samochod {
    private String marka, kolor;
    private int przebieg;

    public Samochod(String marka, String kolor) {
        this.marka = marka;
        this.kolor = kolor;
    }

    public Samochod(String marka, String kolor, int przebieg) {
        this(marka, kolor);
        this.przebieg = przebieg;
    }

    public String get_marka() {
        return marka;
    }

    public String get_kolor() {
        return kolor;
    }

    public int get_przebieg() {
        return przebieg;
    }
}
