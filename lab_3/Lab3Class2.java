import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Class2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("test.dat");
        Scanner sc = new Scanner(f);
        // odczytanie z pliku i wypisanie na ekran
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        ArrayList<String> listaStringow = new ArrayList<>();
        listaStringow.add("raz");
        listaStringow.add("dwa");
        listaStringow.add("trzy");

        for (String s : listaStringow)
            System.out.println(s);

        int rozmiar = listaStringow.size();
        System.out.println(rozmiar);

        sc.close();
    }
}
