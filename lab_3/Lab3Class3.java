import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Class3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("test.dat");
        Scanner sc = new Scanner(f);
        ArrayList<String> listaStringow = new ArrayList<>();

        while (sc.hasNextLine()) {
            listaStringow.add(sc.nextLine());
        }

        for (String s : listaStringow) {
            System.out.println(s);
        }

        int rozmiar = listaStringow.size(); // rozmiar listy
        System.out.println(rozmiar);

        sc.close();
    }
}
