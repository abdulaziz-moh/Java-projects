import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleCalculatorAsignment {


    public static void main(String [] args){

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLUE);
        panel_1.setSize(500, 50);
        panel_1.setLayout(null);

        JFrame frame = new JFrame("SIMPLE CALCULATOR");

        frame.add(panel_1);



        frame.setVisible(true);
        frame.setBounds(500,100,500,500);




    }
    
}
