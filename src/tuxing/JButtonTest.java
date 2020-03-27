package tuxing;

import javax.swing.*;
import java.awt.*;

public class JButtonTest extends JFrame {
    JPanel p=new JPanel();
    JButton b1,b2;

    public JButtonTest(){
        b1=new JButton("111");
        b2=new JButton("222");

        this.getContentPane().add(p);
        p.add(b1); p.add(b2);

        p.setBackground(Color.RED);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonTest();

    }
}
