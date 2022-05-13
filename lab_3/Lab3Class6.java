import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab3Class6 {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("test.txt");
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(plik);

        while (scanner.hasNextLine()) {
            String linia = scanner.nextLine();
            writer.println(linia);
            writer.flush();
        }

        scanner.close();
        writer.close();
    }
}
