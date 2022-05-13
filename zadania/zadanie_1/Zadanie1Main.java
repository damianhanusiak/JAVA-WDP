import java.util.ArrayList;

public class Zadanie1Main {
    public static void main(String[] args) {

        ArrayList<Figura_z1> figury = new ArrayList<>();
        figury.add(new Kolo_z1(5));
        figury.add(new Kolo_z1(10));
        figury.add(new Prostokat_z1(2, 5));
        figury.add(new Prostokat_z1(4, 10));

        for (Figura_z1 f : figury) {
            System.out.println("Pole: " + f.getPole());
            System.out.println("Przeskalowane: ");
            f.przeskaluj(2);
        }
    }
}
