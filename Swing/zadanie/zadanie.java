import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class zadanie extends JFrame implements Runnable {
	// panel sterowania
	private JPanel controlPanel;
	// panel rysowania
	private DrawPanel drawPanel;
	// przycisk
	private JButton bDraw;
	// wielokrotny wybór
	private JComboBox<String> cbColors;

	public zadanie(String title) {
		// tytuł okna
		super(title);
		// rozmiar okna
		setSize(800, 600);
		// zamknięcie okna, zamyka wątek
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ścięcie krawędzi panelu
		// controlPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
		// utworzenie paneli
		controlPanel = new JPanel();
		drawPanel = new DrawPanel();
		// dodanie paneli
		add(controlPanel, BorderLayout.SOUTH);
		add(drawPanel, BorderLayout.CENTER);
		// przycisk
		bDraw = new JButton("Draw");
		controlPanel.add(bDraw);

		// combobox
		cbColors = new JComboBox<>(new String[] { "niebieski", "zielony", "czerwony" });
		controlPanel.add(cbColors);

		bDraw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch ((String) cbColors.getSelectedItem()) {
					case "niebieski":
						drawPanel.changeColor("niebieski");
						break;
					case "zielony":
						drawPanel.changeColor("zielony");
						break;
					case "czerwony":
						drawPanel.changeColor("czerwony");
						break;
					default:
						break;
				}

				drawPanel.counter = 0;
				drawPanel.t.start();
				drawPanel.repaint();
			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new zadanie("zadanie"));
	}

	@Override
	public void run() {
		setVisible(true);
	}
}

class DrawPanel extends JPanel {
	private String color = "default";
	private Ellipse2D el = new Ellipse2D.Double(20, 20, 300, 300);

	public Timer t;
	public int counter = 0;

	public DrawPanel() {
		t = new Timer(500, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (counter <= 20) {
					RectangularShape rs = (RectangularShape) el;
					double moveOffset = 5.0;
					rs.setFrame(rs.getX() + moveOffset, rs.getY(), rs.getWidth(), rs.getHeight());
				} else {
					t.stop();
				}
				counter++;

				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		switch ((String) color) {
			case "niebieski":
				g2.setColor(Color.BLUE);
				break;
			case "zielony":
				g2.setColor(Color.GREEN);
				break;
			case "czerwony":
				g2.setColor(Color.RED);
				break;
			case "default":
				g2.setColor(Color.BLACK);
				break;
			default:
				break;

		}

		g2.draw(el);
	}

	public void changeColor(String c) {
		color = c;
	}
}
