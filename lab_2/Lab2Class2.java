import java.util.Arrays;

public class Lab2Class2 {
	public static void main(String[] args) {
		// 1 tablica
		int[] liczby;
		liczby = new int[5];
		liczby[0] = 3;
		liczby[1] = 12;
		liczby[2] = 15;
		liczby[3] = 111;
		liczby[4] = 223;
		System.out.println(Arrays.toString(liczby));

		// 2 tablica
		int[] liczby1 = new int[3];
		for (int i = 0; i < liczby1.length; i++)
			liczby1[i] = 10 * i;
		System.out.println(Arrays.toString(liczby1));

		// 3 tablica
		double[] liczby2 = { 2.3, 4.5, 6.2, Math.PI, Math.E };
		for (double x : liczby2)
			System.out.println(x);

		// 4 tablica
		String[] lancuchy = { "pierwszy", "drugi", "trzeci" };
		for (String s : lancuchy)
			System.out.println(s);

		// zadanie 1
		int[] tab1 = { 1, 2, 3 };
		int[] tab2 = { 4, 5, 6 };
		int[] suma = new int[3];

		for (int i = 0; i < suma.length; i++)
			suma[i] = tab1[i] + tab2[i];

		System.out.println(Arrays.toString(tab1));
		System.out.println(Arrays.toString(tab2));
		System.out.println(Arrays.toString(suma));

		// laczenie stringow
		String s1 = "Ala", s2 = "ma", s3 = "kota";
		String s4 = s1 + " " + s2 + " " + s3;
		System.out.println(s4);

		// drugi sposob inicjalizacji stringa
		String s5 = new String("Wiesiek");
		System.out.println(s5);

		// rozdzielenie stringa, od podanego znaku
		String s6 = "Byc albo nie byc, oto jest pytanie.";
		System.out.println(s6.substring(16));
		System.out.println(s6.substring(16, 19));

		// od przecinka
		System.out.println(s6.substring(s6.lastIndexOf(",")));
	}
}