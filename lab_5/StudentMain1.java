import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMain1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("studenci.txt");
        Scanner sc = new Scanner(f);
        ArrayList<Student1> studenci = new ArrayList<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String imie = st.nextToken();
            String nazwisko = st.nextToken();
            int rok = Integer.valueOf(st.nextToken());
            int miesiac = Integer.valueOf(st.nextToken());
            int dzien = Integer.valueOf(st.nextToken());
            studenci.add(new Student1(imie, nazwisko, LocalDate.of(rok, miesiac, dzien)));
        }
        sc.close();

        for (Student1 s : studenci) {
            System.out.println(s.getImie() + " " + s.getNazwisko() + " " + s.getdataUrodzenia());
        }
    }
}
