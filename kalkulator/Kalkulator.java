import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// prosty kalkulator wykonany za pomocą bibliotegi Swing
public class Kalkulator extends JFrame implements Runnable {
    // rozmiary okna
    private final int w = 400, h = 200;
    // przyciski
    private JButton b1, b2, b3, b4;
    // okienka do wpisywania
    private JTextField f1, f2;
    // pole tekstowe do wypisywania wyniku
    private JLabel label;

    public Kalkulator(String title) {
        // konstruktor, tutuł okna z parametru
        super(title);
        // rozmiar okna
        setSize(w, h);
        // panel, przyciski nie nachodzą na siebie
        setContentPane(new JPanel());
        // pobranie rozmiarów okna
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        // rozmieszczenie okna na ekranie
        setLocation(((size.width) / 2) - 200, ((size.height) / 2) - 100);
        // stworzenie okienek do wpisywania liczb, columns to szerokość
        f1 = new JTextField(5);
        f2 = new JTextField(5);
        add(f1);
        add(f2);
        // stworzenie przycisków
        b1 = new JButton("+");
        add(b1);
        b2 = new JButton("-");
        add(b2);
        b3 = new JButton("*");
        add(b3);
        b4 = new JButton("/");
        add(b4);
        // pole tekstowe do wypisywania wyniku
        label = new JLabel();
        add(label);

        Dodawanie operacjaDodawanie = new Dodawanie();
        Odejmowanie operacjaOdejmowanie = new Odejmowanie();
        Mnozenie operacjaMnozenie = new Mnozenie();
        Dzielenie operacjaDzielenie = new Dzielenie();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer l1 = Integer.parseInt(f1.getText());
                Integer l2 = Integer.parseInt(f2.getText());
                label.setText(operacjaDodawanie.doOperation(l1, l2).toString());
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer l1 = Integer.parseInt(f1.getText());
                Integer l2 = Integer.parseInt(f2.getText());
                label.setText(operacjaOdejmowanie.doOperation(l1, l2).toString());
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer l1 = Integer.parseInt(f1.getText());
                Integer l2 = Integer.parseInt(f2.getText());
                label.setText(operacjaMnozenie.doOperation(l1, l2).toString());
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer l1 = Integer.parseInt(f1.getText());
                Integer l2 = Integer.parseInt(f2.getText());
                label.setText(operacjaDzielenie.doOperation(l1, l2).toString());
            }
        });

        // widoczność okna
        setVisible(true);
    }

    @Override
    public void run() {
        // zamknięcie okna, zamyka wątek
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    abstract class Operation {
        abstract Integer doOperation(int x, int y);
    }

    class Dodawanie extends Operation {
        @Override
        Integer doOperation(int x, int y) {
            return x + y;
        }
    }

    class Odejmowanie extends Operation {
        @Override
        Integer doOperation(int x, int y) {
            return x - y;
        }
    }

    class Mnozenie extends Operation {
        @Override
        Integer doOperation(int x, int y) {
            return x * y;
        }
    }

    class Dzielenie extends Operation {
        @Override
        Integer doOperation(int x, int y) {
            return x / y;
        }
    }
}
