import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class PrintTimer {
    public static void main(String[] args) {
        TimerBox tb = new TimerBox(1000);
        tb.start();
        JOptionPane.showMessageDialog(null, "ok");
    }
}

class TimerBox {
    private Timer t;
    // private int interval;

    public TimerBox(int interval) {
        // this.interval = interval;
        TimerListener tl = new TimerListener();
        t = new Timer(interval, tl);
    }

    public void start() {
        t.start();
    }
}

// co ma być zrobione
class TimerListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(LocalTime.now());
    }

}
