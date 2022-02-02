package Label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Program {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\DUDUSPOWER\\IdeaProjects\\BroGui\\src\\main\\java\\mynft.png");
        Border border = BorderFactory.createLineBorder(Color.black,3);
        JLabel label = new JLabel("Witam!");
        JFrame frame = new JFrame();

        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.ORANGE);
        label.setFont(new Font("tak", Font.BOLD, 36));
        label.setIconTextGap(-5);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,610,680);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.add(label);
        //frame.setLayout(null);
        frame.pack();

    }
}
