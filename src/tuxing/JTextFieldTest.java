package tuxing;

import javax.swing.*;
import java.util.jar.JarFile;

public class JTextFieldTest {
    JFrame frame =new JFrame();
    JPanel p =new JPanel();
    JTextField txt=new JTextField(20);
    JLabel lbl=new JLabel("qsr");
    public JTextFieldTest(){
        frame.getContentPane().add(p);
        p.add(lbl);
        p.add(txt);


        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
