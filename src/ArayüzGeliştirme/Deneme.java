package ArayüzGeliştirme;
import javax.swing.*;
import java.awt.*;


public class Deneme {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GUI Example");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        JButton jButton1 = new JButton("Button 1");
        JButton jButton2 = new JButton("Button 2");
        jFrame.getContentPane().add(jButton1);
        jFrame.getContentPane().add(jButton2);
        jFrame.setVisible(true);

    }

}
