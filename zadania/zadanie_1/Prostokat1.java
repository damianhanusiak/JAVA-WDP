public class Prostokat1 extends Figura1 {
    private int szerokosc, wysokosc;

    public Prostokat1(int szerokosc, int wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    public double getPole() {
        return szerokosc * wysokosc;
    }

    @Override
    public void przeskaluj(double czynnik) {
        System.out.println(getPole() * czynnik);
    }
}
