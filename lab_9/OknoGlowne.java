import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OknoGlowne extends JFrame implements Runnable, ActionListener {
    // rozmiary okna
    private final int w = 400, h = 250;
    // przyciski
    private JButton b1, b2;
    private JComboBox<Operation> cbOperacje;
    private Operation[] operacje = new Operation[2];
    // okienka do wpisywania wartości
    private JTextField f1, f2;
    // pole tekstowe do wypisywania wyniku
    private JLabel label;

    public OknoGlowne(String title) {
        // tytuł okna
        super(title);
        // rozmiar okna
        setSize(w, h);
        // stworzenie panelu, przyciski wtedy nie nachodzą na siebie
        setContentPane(new JPanel());
        // pobranie rozmiarów okna
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        // rozmieszczenie okna na ekranie
        setLocation(((size.width) / 2) - 200, ((size.height) / 2) - 125);
        // przycisk 1
        b1 = new JButton("Przycisk 1");
        add(b1);
        // przycisk 2
        b2 = new JButton("Wykonaj operacje");
        add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Kliknieto w przycisk 1");
            }
        });

        b2.addActionListener(this);
        operacje[0] = new Dodawanie();
        operacje[1] = new Mnozenie();
        cbOperacje = new JComboBox<>(operacje);
        add(cbOperacje);

        f1 = new JTextField(4);
        f2 = new JTextField(4);
        add(f1);
        add(f2);

        label = new JLabel();
        add(label);

        // widoczność okna
        setVisible(true);
    }

    @Override
    public void run() {
        // zamknięcie okna, zamyka wątek
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // JOptionPane.showMessageDialog(null, "Kliknieto w przycisk 2");
        Integer l1 = Integer.parseInt(f1.getText());
        Integer l2 = Integer.parseInt(f2.getText());
        label.setText((((Operation) cbOperacje.getSelectedItem()).doOperation(l1, l2)).toString());
    }

    abstract class Operation {
        abstract Integer doOperation(int x, int y);
    }

    class Dodawanie extends Operation {
        @Override
        Integer doOperation(int x, int y) {
            return x + y;
        }

        @Override
        public String toString() {
            return "Dodaj";
        }
    }

    class Mnozenie extends Operation {
        @Override
        Integer doOperation(int x, int y) {
            return x * y;
        }

        @Override
        public String toString() {
            return "Mnozenie";
        }
    }
}
