import java.util.ArrayList;

public class SamochodTest {
    public static void main(String[] args) {
        ArrayList<Samochod> samochody = new ArrayList<>();
        samochody.add(new Samochod("BMW", "czarny", 10000));
        samochody.add(new Samochod("Audi", "srebrny", 20000));
        samochody.add(new Samochod("Jeep", "czerwony", 30000));
        samochody.add(new Samochod("Ford", "niebieski", 40000));

        for (Samochod s : samochody) {
            System.out.println(s.get_marka() + ", " + s.get_kolor() + ", " + s.get_przebieg());
        }
    }
}
