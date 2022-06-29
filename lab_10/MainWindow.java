import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MainWindow extends JFrame implements Runnable {
    // panele
    private JPanel controlPanel;
    private DrawPanel drawPanel;
    // pole edycyjne
    private JTextField tfxs, tfys, tfxe, tfye;
    // przycisk
    private JButton bDraw, bClose;
    // wybór
    private JComboBox<String> cbShapes;

    public MainWindow(String title) {
        // tytuł okna
        super(title);
        // rozmiar okna
        setSize(800, 600);
        // zamknięcie okna, zamyka wątek
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // stworzenie panele
        controlPanel = new JPanel();
        drawPanel = new DrawPanel();
        // ścięcie krawędzi panelu
        controlPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        // dodanie paneli
        add(controlPanel, BorderLayout.SOUTH);
        add(drawPanel, BorderLayout.CENTER);
        // pola edycyjne
        tfxs = new JTextField(3);
        tfys = new JTextField(3);
        tfxe = new JTextField(3);
        tfye = new JTextField(3);
        controlPanel.add(tfxs);
        controlPanel.add(tfys);
        controlPanel.add(tfxe);
        controlPanel.add(tfye);
        // przyciski
        bDraw = new JButton("Rysuj");
        controlPanel.add(bDraw);
        bClose = new JButton("Close");
        controlPanel.add(bClose);

        // obsługa przycisku bDraw
        bDraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double xs = Double.parseDouble(tfxs.getText());
                double ys = Double.parseDouble(tfys.getText());
                double xe = Double.parseDouble(tfxe.getText());
                double ye = Double.parseDouble(tfye.getText());
                switch ((String) cbShapes.getSelectedItem()) {
                    case "Rectangle":
                        Rectangle2D r = new Rectangle2D.Double(xs, ys, xe, ye);
                        drawPanel.addShape(r);
                        break;
                    case "Ellipse":
                        Ellipse2D el = new Ellipse2D.Double(xs, ys, xe, ye);
                        drawPanel.addShape(el);
                        break;
                    case "Line":
                        Line2D l = new Line2D.Double(xs, ys, xe, ye);
                        drawPanel.addShape(l);
                        break;
                    default:
                        break;
                }
                drawPanel.repaint();
            }
        });
        // obsługa przycisku bClose
        bClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // wybór
        cbShapes = new JComboBox<>(new String[] { "Rectangle", "Ellipse", "Line" });
        controlPanel.add(cbShapes);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new MainWindow("Okno glowne"));
    }

    @Override
    public void run() {
        // widoczność okna
        setVisible(true);
    }
}

class DrawPanel extends JPanel {
    private List<Shape> shapes = new ArrayList<>();
    // timer
    // private Timer t;

    // public DrawPanel() {
    // t = new Timer(1000, new ActionListener(){
    // @Override
    // public void actionPerformed(ActionEvent e) {
    // for(Shape s: shapes) {
    // RectangularShape rs = (RectangularShape)s;
    // double moveOffset = 1.0;
    // rs.setFrame(rs.getX() + moveOffset, rs.getY(), rs.getWidth(),
    // rs.getHeight());
    // }
    // repaint();
    // }
    // })
    // t.start();
    // }

    // rysowanie w okienku
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.cyan);
        Rectangle2D rec = new Rectangle2D.Double(20, 20, 500, 300);
        Ellipse2D eli = new Ellipse2D.Double(20, 20, 500, 300);
        Line2D line = new Line2D.Double(20, 20, 500, 300);
        g2.draw(rec);
        g2.draw(eli);
        g2.draw(line);

        for (Shape s : shapes) {
            g2.draw(s);
        }
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }
}