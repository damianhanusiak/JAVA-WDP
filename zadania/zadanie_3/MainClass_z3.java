import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass_z3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("zadanie_3.txt");
        Scanner sc = new Scanner(f);
        LinePrinter_z3 lp = new LinePrinter_z3();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String imie = st.nextToken();
            String nazwisko = st.nextToken();

            lp.printLine(imie, nazwisko, new Formatter_z3() {
                @Override
                public String format(String imie, String nazwisko) {
                    return "<" + imie + ">" + " <" + nazwisko + ">";
                }
            });

        }
        sc.close();
    }
}
