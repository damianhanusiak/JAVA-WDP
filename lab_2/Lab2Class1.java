public class Lab2Class1 {
	public static void main(String[] args) {
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);

		if (args.length >= 2) {
			Integer l1, l2;
			l1 = Integer.valueOf(args[0]);
			l2 = Integer.valueOf(args[1]);
			int suma = l1 + l2;
			System.out.println(suma);
		}
	}
}