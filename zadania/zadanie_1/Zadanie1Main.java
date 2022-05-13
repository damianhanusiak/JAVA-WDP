import java.util.ArrayList;

public class Zadanie1Main {
    public static void main(String[] args) {

        ArrayList<Figura1> figury = new ArrayList<>();
        figury.add(new Kolo1(5));
        figury.add(new Kolo1(10));
        figury.add(new Prostokat1(2, 5));
        figury.add(new Prostokat1(4, 10));

        for (Figura1 f : figury) {
            System.out.println("Pole: " + f.getPole());
            System.out.println("Przeskalowane: ");
            f.przeskaluj(2);
        }
    }
}
