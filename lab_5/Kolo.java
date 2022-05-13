public class Kolo extends Figura {
    private double r;

    public Kolo(double r) {
        this.r = r;
        setRodzaj("kolo");
    }

    public double get_pole() {
        return Math.PI * r * r;
    }

    public double get_obwod() {
        return 2 * Math.PI * r;
    }
}
