public class Kolo1 extends Figura1 {
    private int promien;

    public Kolo1(int promien) {
        this.promien = promien;
    }

    @Override
    public double getPole() {
        return Math.PI * promien * promien;
    }

    @Override
    public void przeskaluj(double czynnik) {
        System.out.println(getPole() * czynnik);
    }
}
