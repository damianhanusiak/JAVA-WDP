public class ProjectManager extends Pracownik {

    private int liczbaProjektow;

    public ProjectManager(String imie, String nazwisko, double pensja, int liczbaProjektow) {
        super(imie, nazwisko, pensja);
        this.liczbaProjektow = liczbaProjektow;
        setStanowisko("Project Manager");
    }

    public int getLiczba() {
        // System.out.println("Liczba projektow: " + liczbaProjektow);
        return liczbaProjektow;
    }
}
