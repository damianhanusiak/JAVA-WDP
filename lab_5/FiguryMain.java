import java.util.ArrayList;

public class FiguryMain {
    public static void main(String[] args) {
        // ArrayList<Prostokat> prostokaty = new ArrayList<>();
        ArrayList<Figura> figury = new ArrayList<>();
        figury.add(new Prostokat(12, 4));
        figury.add(new Prostokat(3, 4));
        figury.add(new Kwadrat(6));
        figury.add(new Kolo(6));

        for (Figura f : figury) {
            System.out
                    .println("Rodzaj figury: " + f.getRodzaj() + " Pole: " + f.get_pole() + " Obwód: " + f.get_obwod());
        }
    }
}
