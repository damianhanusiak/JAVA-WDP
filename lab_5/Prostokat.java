public class Prostokat extends Figura {
    private double wysokosc, szerokosc;

    public Prostokat(double wysokosc, double szerokosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        setRodzaj("prostokat");
    }

    public double get_wysokosc() {
        return wysokosc;
    }

    public double get_szerokosc() {
        return szerokosc;
    }

    public double get_pole() {
        return wysokosc * szerokosc;
    }

    public double get_obwod() {
        return 2 * wysokosc + 2 * szerokosc;
    }
}
