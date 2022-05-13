import java.util.Arrays;

public class Lab2Class3 {
    public static void main(String[] args) {
        // tablica intów
        int[] tab = new int[5];
        // inicjalizacja
        for (int i = 0; i < tab.length; i++) {
            tab[i] = 12 * i + 1;
        }
        // drukowanie
        System.out.println(Arrays.toString(tab));
        // drukowanie pętla
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        // drukowanie podobne do foreach
        for (int i : tab) {
            System.out.println(i);
        }

        // tablica double
        double[] tab1 = { 1.2, 3.4, 5.6, 7.6, Math.PI, Math.E };
        System.out.println(Arrays.toString(tab1));

        // tablica Stringów
        String[] tab2 = { "Raz", "Dwa", "Trzy" };
        String[] tab3 = { "Ala", "Ma", "Kota" };
        String[] suma = new String[3];
        for (String s : tab2) {
            System.out.println(s);
        }
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(tab3));

        for (int i = 0; i < suma.length; i++) {
            suma[i] = tab2[i] + tab3[i];
        }
        System.out.println(Arrays.toString(suma));
    }
}
