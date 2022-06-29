import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("Janek");
        s1.add("Franek");
        // set pilnuje, że element tylko 1 raz
        // s1.add("Janek");
        for (String s : s1) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------");

        Set<Czlowiek> s2 = new HashSet<Czlowiek>();
        s2.add(new Czlowiek("Janek", "Kowalski"));
        s2.add(new Czlowiek("Zbigniew", "Nowak"));
        s2.add(new Czlowiek("Janek", "Kowalski"));
        s2.add(new Czlowiek("Franek", "Kowalski"));
        s2.add(new Czlowiek("Janek", "Franek"));

        for (Czlowiek s : s2) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------");

        Set<Czlowiek> s3 = new TreeSet<>(s2);
        for (Czlowiek s : s3) {
            System.out.println(s);
        }

        File f = new File("Pan Tadeusz.txt");
        HashSet<String> s4 = new HashSet<>();
        Scanner sc;
        try {
            sc = new Scanner(f);
            while (sc.hasNext()) {
                s4.add(sc.next());
            }
            s4.forEach(System.out::println);
            System.out.println(s4.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        TreeSet<String> sorteds4 = new TreeSet<>(s4);
        sorteds4.forEach(System.out::println);
    }
}

class Czlowiek implements Comparable<Czlowiek> {
    private String imie, nazwisko;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

    @Override
    public int hashCode() {
        return imie.hashCode() + nazwisko.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Czlowiek c = (Czlowiek) obj;
        return imie.equals(c.imie) && nazwisko.equals(c.nazwisko);
    }

    @Override
    public int compareTo(Czlowiek o) {
        int nazwisko_order;
        nazwisko_order = this.nazwisko.compareTo(o.nazwisko);
        return nazwisko_order == 0 ? this.imie.compareTo(o.imie) : nazwisko_order;
    }
}
