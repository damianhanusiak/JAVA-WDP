// Zadanko treningowe: 
// Zaprogramuj klasę LiczbaZespolona, posiadającą konstruktor oraz metody re(), im() i moduł(). 
// Załaduj do listy kilka liczb zespolonych a następnie zapisz je do pliku w formacie: część rzeczywista, część urojona, moduł.

import java.lang.Math;

public class LiczbaZespolona {
    private int rzeczywista, urojona;
    private double modul;

    public LiczbaZespolona(int rzeczywista, int urojona) {
        this.rzeczywista = rzeczywista;
        this.urojona = urojona;
    }

    public int re() {
        return rzeczywista;
    }

    public int im() {
        return urojona;
    }

    public double modul() {
        modul = Math.sqrt((Math.pow(rzeczywista, 2)) + (Math.pow(urojona, 2)));
        return modul;
    }
}
