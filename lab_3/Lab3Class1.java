import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Lab3Class1 {
    public static void main(String[] args) throws FileNotFoundException {
        String s1 = "Ala";
        String s2 = "Ala";
        System.out.println(s1 == s2); // sprawdzana równość referencji

        File f = new File("test.dat");
        PrintWriter pw = new PrintWriter(f); // printwriter - służy edytowaniu danych, które chcemy wypuścić

        Scanner sc = new Scanner(System.in); // scanner - będzie przetwarzał to co wpłynie ze standardowego źródła

        // odycztanie tekstu z wejscia standardowego
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("quit")) {
                break;
            }
            System.out.println(s);
            pw.println(s); // zapisanie do pliku
            pw.flush(); // jawne opróżnienie bufora
        }
        pw.close();
        sc.close();
    }
}