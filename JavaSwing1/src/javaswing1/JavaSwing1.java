package javaswing1;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaSwing1 {

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("Thor.png");
        
        JOptionPane.showMessageDialog(null, "Wrong Password","This is a Title", JOptionPane.PLAIN_MESSAGE,icon);

    }

}
