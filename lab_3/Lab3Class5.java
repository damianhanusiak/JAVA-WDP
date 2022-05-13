import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab3Class5 {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("plik.txt");

        PrintWriter writer = new PrintWriter(plik);
        writer.println("A dodam sobie cos!");
        writer.flush();
        writer.close();

        Scanner scanner = new Scanner(plik);
        // odczytanie z pliku
        while (scanner.hasNext()) {
            String linia = scanner.nextLine();
            System.out.println(linia);
        }

        scanner.close();
    }
}
