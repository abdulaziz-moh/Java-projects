import javax.swing.JOptionPane;


public class DialogBox {
    
    public static void main(String [] args ){
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello " + name + " welcome to java GUI world!!");
        System.out.println(name);


    }
}
