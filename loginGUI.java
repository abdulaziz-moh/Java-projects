import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class loginGUI extends JFrame {

    private JLabel username = new JLabel("User name: ");
    private JLabel pwd = new JLabel("Password: ");
    private JLabel generallabel =  new JLabel("LOGIN");

    loginGUI(){
        setTitle("LOGIN PAGE");
        setBounds(300, 90, 900, 600);

        generallabel.setFont(new Font("arial",Font.PLAIN,30));

        generallabel.setFont(new Font("Arial", Font.PLAIN, 30));
        generallabel.setSize(300, 30);
        generallabel.setSize(300, 30);

        generallabel.setLocation(300, 30);
        add(generallabel);










        setVisible(true);
    }
    
}

