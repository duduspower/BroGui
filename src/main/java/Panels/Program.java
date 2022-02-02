package Panels;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        JPanel bluePanel = new JPanel();
        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();

        Icon icon = new ImageIcon("C:\\Users\\DUDUSPOWER\\IdeaProjects\\BroGui\\src\\main\\java\\mynft.png");

        label.setText("Witam!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0,0,250,250);
        
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(250,0,250,250);
        
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);

        redPanel.setLayout(new BorderLayout());
        redPanel.add(label);
    }
}
