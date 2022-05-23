import java.util.StringTokenizer;

public class DataAnalyzer {
    public double analyze(String line) throws NoKmException, NoUsageException, NoCarUsageException {
        double zasieg = 0;
        StringTokenizer st = new StringTokenizer(line);
        int km = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        if (km == 0) {
            throw new NoKmException(l);
        }
        if (l == 0) {
            throw new NoUsageException(km);
        }
        if (l == 0 && km == 0) {
            throw new NoCarUsageException();
        }
        zasieg = (double) km / (double) l;
        return zasieg;
    }
}

class NoKmException extends Exception {
    private int l;

    public NoKmException(int l) {
        super("Liczba kilometrow wynosi 0!");
        this.l = l;
    }

    public int getLiters() {
        return l;
    }
}

class NoUsageException extends Exception {
    private int km;

    public NoUsageException(int km) {
        super("Liczba spalonego litrow wynosi 0!");
        this.km = km;
    }

    public int getKm() {
        return km;
    }
}

class NoCarUsageException extends Exception {
    public NoCarUsageException() {
        super("Samochod nie byl uzywany!");
    }
}
