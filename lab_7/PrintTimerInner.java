import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class PrintTimerInner {
    public static void main(String[] args) {
        TimerBoxInner tb = new TimerBoxInner(1000);
        tb.start();
        JOptionPane.showMessageDialog(null, "ok");
    }
}

class TimerBoxInner {
    class TimerListener implements ActionListener {
        // klasa wewnętrzna ma dostęp do składowych klasy zewnetrznej
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(LocalTime.now() + " odliczamy co " + interval + " milisekund");
        }
    }

    private Timer t;
    private int interval;

    public TimerBoxInner(int interval) {
        this.interval = interval;
        TimerListener tl = new TimerListener();
        t = new Timer(interval, tl);
    }

    public void start() {
        t.start();
    }
}
