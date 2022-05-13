import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab3Class4 {
    public static void main(String[] args) throws FileNotFoundException {
        // otwarcie pliku
        File file = new File("plik.txt");

        // printwriter - zapis do pliku
        PrintWriter writer = new PrintWriter(file);
        writer.println("Ala ma kota");
        writer.println("A ja nie mam");
        writer.close();

        // scanner - czyta z pliku
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String linia = scanner.nextLine();
            System.out.println(linia);
        }

        scanner.close();
    }
}
