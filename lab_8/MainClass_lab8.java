import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass_lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        DataAnalyzer da = new DataAnalyzer();

        Scanner sc = new Scanner(new File("dane.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            try {
                double zasieg = da.analyze(line);
                System.out.println("Zasieg: " + zasieg);
            } catch (NoKmException e1) {
                System.out.println("Zuzyto: " + e1.getLiters() + " Zuzyto paliwo, ale nie przejechano km!");
            } catch (NoUsageException e2) {
                System.out.println("Zuzyto: " + e2.getKm() + " Przejechano dystans bez zuzycia paliwa!");
            } catch (NoCarUsageException e3) {
                System.out.println("Samochod nie byl uzywany!");
            }
        }
    }
}
