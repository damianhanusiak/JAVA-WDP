import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class PrintTimerAnonymousLocal {
    public static void main(String[] args) {
        TimerBoxAnonymousLocal tb = new TimerBoxAnonymousLocal(1000);
        tb.start();
        JOptionPane.showMessageDialog(null, "ok");

        // System.out.println(dodaj(1, 2, 3));
    }

    public static double dodaj(Double... ds) {
        double suma = 0;
        for (Double d : ds) {
            suma += d;
        }
        return suma;
    }
}

class TimerBoxAnonymousLocal {

    private Timer t;
    private int interval;

    public TimerBoxAnonymousLocal(int interval) {
        // class TimerListener implements ActionListener {
        // // klasa w konstruktorze

        // }
        this.interval = interval;
        // TimerListener tl = new TimerListener();
        t = new Timer(interval, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LocalTime.now() + " odliczamy co " + interval + " milisekund");
            }
        });
    }

    public void start() {
        t.start();
    }
}
