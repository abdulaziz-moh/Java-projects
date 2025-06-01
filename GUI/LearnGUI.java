import javax.swing.JFrame;
import javax.swing.JLabel;

public class LearnGUI {

    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("This is GUI learning APP");
        




        JFrame frame = new JFrame();
        frame.setTitle("GUI APP");
        frame.setName("GUI APP");
        // setLocation(500,100)
        // frame.setSize(500,500);
        frame.setBounds(500,100,500,500);
        frame.add(label);
        frame.setVisible(true);














    }
    
}
