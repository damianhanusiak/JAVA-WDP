import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class PrintTimerLocal {
    public static void main(String[] args) {
        TimerBoxLocal tb = new TimerBoxLocal(1000);
        tb.start();
        JOptionPane.showMessageDialog(null, "ok");
    }
}

class TimerBoxLocal {

    private Timer t;
    private int interval;

    public TimerBoxLocal(int interval) {
        class TimerListener implements ActionListener {
            // klasa w konstruktorze
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LocalTime.now() + " odliczamy co " + interval + " milisekund");
            }
        }
        this.interval = interval;
        TimerListener tl = new TimerListener();
        t = new Timer(interval, tl);
    }

    public void start() {
        t.start();
    }
}
