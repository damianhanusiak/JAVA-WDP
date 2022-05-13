public class Kolo_z1 extends Figura_z1 {
    private int promien;

    public Kolo_z1(int promien) {
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
