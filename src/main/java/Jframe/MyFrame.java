package Jframe;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("A taki teścik");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon image = new ImageIcon("C:\\Users\\DUDUSPOWER\\IdeaProjects\\BroGui\\src\\main\\java\\boom.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.GREEN);
    }
}
