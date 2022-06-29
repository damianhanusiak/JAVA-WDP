import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
import java.security.KeyStore.Entry;

public class MatMain {
    public static void main(String[] args) {
        Map<String, Czlowiek> ludzie = new HashMap<>();
        File f = new File("osoby.dat");
        Scanner sc;
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                String pesel = st.nextToken();
                String imie = st.nextToken();
                String nazwisko = st.nextToken();
                ludzie.put(pesel, new Czlowiek(imie, nazwisko));
                Set<Entry<String, Czlowiek>> z = ludzie.entrySet();
                for (Entry<String, Czlowiek> e : z) {
                    System.out.println(e.getKey() + e.getValues());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
