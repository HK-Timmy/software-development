import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class GUI {

    public static void main (String[] args){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        
    }
}
