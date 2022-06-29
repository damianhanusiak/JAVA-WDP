public class Main111 {
    public static void main(String[] args) {
        double[] a1 = new double[] { 1, 2, 3, 4, 5, 6, 7, 78, 9 };
        double[] a2 = new double[] { 1.4, 2.1, Math.PI, Math.sqrt(2), 1.1, 3.2, 5.3, 1.6, 5.21 };

        ArrayManipulator am = new ArrayManipulator(a1, a2);
        // try mozna dac osobno na kazde wywolanie jakby byly rozne
        try {
            am.printManipulatedResult((a, b) -> a + b);
            System.out.println("----");
            am.printManipulatedResult((a, b) -> a * a - b);
        } catch (NotEqualSizeArraysException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ArrayManipulator {
    private double[] a1, a2;

    public ArrayManipulator(double[] a1, double[] a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public void printManipulatedResult(NumberManipulator nm) throws NotEqualSizeArraysException {
        if (a1.length != a2.length) {
            throw new NotEqualSizeArraysException();
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(nm.manipulateNumbers(a1[i], a2[i]));
        }
    }
}

@FunctionalInterface
interface NumberManipulator {
    double manipulateNumbers(double a, double b);
}

class NotEqualSizeArraysException extends Exception {
    public NotEqualSizeArraysException() {
        super("Array have different length!");
    }
}