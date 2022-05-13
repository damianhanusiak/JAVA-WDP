import java.util.ArrayList;

public class CzlowiekTest {
    public static void main(String[] args) {
        String s1 = new String("Ala ma kota");
        System.out.println(s1);

        Czlowiek c1 = new Czlowiek("Jan", "Kowalski", 35);
        System.out.println(c1.get_imie());
        System.out.println(c1.get_nazwisko());
        System.out.println(c1.get_wiek());

        ArrayList<Czlowiek> ludzie = new ArrayList<>();
        ludzie.add(c1);
        ludzie.add(new Czlowiek("Zofia", "Krynicka", 27));
        ludzie.add(new Czlowiek("Marian", "Kociniak", 56));

        for (Czlowiek c : ludzie) {
            System.out.println(
                    c.get_imie() + ", " + c.get_nazwisko() + "," + c.get_wiek() + ", " + c.getDateTimeOfCreation()
                            + ", " + c.getInstanceNo());
        }
    }
}
