public abstract class Figura implements Printable {
    private String rodzaj;

    protected void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Override
    public String getRodzaj() {
        return rodzaj;
    }

    public abstract double get_pole();

    public abstract double get_obwod();
}
