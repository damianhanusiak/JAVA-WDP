// Zadanko treningowe: 
// Zaprogramuj klasę LiczbaZespolona, posiadającą konstruktor oraz metody re(), im() i moduł(). 
// Załaduj do listy kilka liczb zespolonych a następnie zapisz je do pliku w formacie: część rzeczywista, część urojona, moduł.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LiczbaZespolonaTest {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<LiczbaZespolona> liczby_zespolone = new ArrayList<>();
        liczby_zespolone.add(new LiczbaZespolona(1, 2));
        liczby_zespolone.add(new LiczbaZespolona(3, 4));
        liczby_zespolone.add(new LiczbaZespolona(5, 6));
        liczby_zespolone.add(new LiczbaZespolona(7, 8));

        File f = new File("zespolone.txt");
        PrintWriter pw = new PrintWriter(f);

        for (LiczbaZespolona l : liczby_zespolone) {
            System.out.println("Liczba zespolona: " + l.re() + " + " + l.im() + "i, Modul: " + l.modul());
            pw.write("Liczba zespolona: " + l.re() + " + " + l.im() + "i, Modul: " + l.modul() + "\n");
            pw.flush();
        }
        pw.close();
    }
}
